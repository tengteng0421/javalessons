package javalessons3.server.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlTest1 {

	// SAX解析 java中共有4中解析方式
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// 1. 获取解析工厂

		SAXParserFactory factory = SAXParserFactory.newInstance();
		// 2. 从解析工厂获取解析器
		SAXParser parser = factory.newSAXParser();
		// 3. 加载文档document注册器

		// 4. 编写处理器
		WebHandler handler = new WebHandler();
		parser.parse(Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("javalessons3/server/servlet/web.xml"), handler);
		List<Entity> entitys = handler.getEntitys();
		for (Entity entity : entitys) {
			System.out.println(entity.getName() + " " + entity.getClz());
		}
		List<Mapping> mappings = handler.getMappings();
		for (Mapping mapping : mappings) {
			System.out.print(mapping.getName() + " ");
			for (String url : mapping.getUrls()) {
				System.out.print(url + " ");
			}
			System.out.println();
		}
	}

}

class WebHandler extends DefaultHandler {

	List<Entity> entitys;
	Entity entity;
	List<Mapping> mappings;
	Mapping mapping;

	public List<Entity> getEntitys() {
		return entitys;
	}

	public List<Mapping> getMappings() {
		return mappings;
	}

	private String tag;
	private boolean isServlet = false;

	@Override
	public void startDocument() throws SAXException {
		System.out.println("解析开始-----");
		entitys = new ArrayList<>();
		mappings = new ArrayList<>();
		super.startDocument();
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("解析结束-----");
		super.endDocument();
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("解析：" + qName);
		if ("servlet".equals(qName)) {
			entity = new Entity();
			isServlet = true;
		} else if ("servlet-mapping".equals(qName)) {
			mapping = new Mapping();
			isServlet = false;
		}
		tag = qName;
		super.startElement(uri, localName, qName, attributes);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("解析完成：" + qName);
		if ("servlet".equals(qName)) {
			entitys.add(entity);
		} else if ("servlet-mapping".equals(qName)) {
			mappings.add(mapping);
		}
		tag = null;
		super.endElement(uri, localName, qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (tag == null) {
			return;
		}
		String content = new String(ch, start, length).trim();
		System.out.println("内容为： " + content);
		if ("servlet-name".equals(tag)) {
			if (isServlet) {
				entity.setName(content);
			} else {
				mapping.setName(content);
			}
		} else if ("servlet-class".equals(tag)) {
			entity.setClz(content);
		} else if ("url-pattern".equals(tag)) {
			mapping.addUrl(content);
		}
		super.characters(ch, start, length);
	}
}
