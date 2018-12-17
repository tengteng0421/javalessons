package javalessons2.net.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {

	public static void main(String[] args) throws UnknownHostException {
		// ip¿‡
		InetAddress localHost = InetAddress.getLocalHost();
		System.out.println(localHost.getHostName());
		System.out.println(localHost.getHostAddress());
		String str = "www.syau.edu.cn";
		InetAddress byName = InetAddress.getByName(str);
		System.out.println(byName.getHostAddress());
		System.out.println(byName.getHostName());
		System.out.println();
	}
}
