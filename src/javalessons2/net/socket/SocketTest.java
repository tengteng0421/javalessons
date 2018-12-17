package javalessons2.net.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.junit.Test;

public class SocketTest {
	public static void main(String[] args) {
		InetSocketAddress i = new InetSocketAddress("localhost", 8080);
		System.out.println(i.getHostName());
	}

	@Test
	public void searchPort() throws IOException {
		String str = "www.syau.edu.cn";
		InetAddress byName = InetAddress.getByName(str);
		String hostAddress = byName.getHostAddress();
		InetSocketAddress isa = null;
		Socket s = new Socket();
		System.out.println(hostAddress);
		System.out.println(byName.isReachable(5000));
		for (int i = 0; i < 65536; i++) {
			isa = new InetSocketAddress(hostAddress, i);
			try {
				s.bind(isa);
			} catch (IOException e) {
				// System.out.println("²»¿ÉÓÃ£º" + i);
				continue;// TODO Auto-generated catch block
			}
			System.out.println(hostAddress + ":" + i);
		}
	}
}
