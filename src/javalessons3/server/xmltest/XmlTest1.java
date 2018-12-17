package javalessons3.server.xmltest;

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
		PersonHandler per = new PersonHandler();
		parser.parse(Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("javalessons3/server/xmltest/person.xml"), per);
		for (Person person : per.persons) {
			System.out.println(person.getName() + " " + person.getAge());
		}
	}

}

class PersonHandler extends DefaultHandler {

	List<Person> persons;
	Person person;
	private String tag;

	@Override
	public void startDocument() throws SAXException {
		System.out.println("解析开始-----");
		persons = new ArrayList<>();
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
		if ("person".equals(qName)) {
			person = new Person();
		}
		if ("name".equals(qName)) {
			tag = "name";
		}
		if ("age".equals(qName)) {
			tag = "age";
		}
		super.startElement(uri, localName, qName, attributes);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("解析完成：" + qName);
		if ("person".equals(qName)) {
			persons.add(person);
		}
		if ("name".equals(qName)) {
			tag = null;
		}
		if ("age".equals(qName)) {
			tag = null;
		}
		super.endElement(uri, localName, qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (tag == null) {
			return;
		}
		String string = new String(ch, start, length).trim();
		System.out.println("内容为： " + string);
		if ("name".equals(tag)) {
			person.setName(string);
		}
		if ("age".equals(tag)) {
			person.setAge(Integer.valueOf(string));
		}
		super.characters(ch, start, length);
	}
}
