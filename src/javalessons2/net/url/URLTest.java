package javalessons2.net.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
	public static void main(String[] args) throws MalformedURLException {
		// www.baidu.com:80/index.html
		URL url = new URL("www.baidu.com:80/index.html");
		// ��ò���
		url.getQuery();
		// ���ê��
		url.getRef();
	}
}
