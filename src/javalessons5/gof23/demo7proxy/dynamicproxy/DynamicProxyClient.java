package javalessons5.gof23.demo7proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class DynamicProxyClient {
	public static void main(String[] args) {
		Star realStar = new RealStar();
		StarHandler handler = new StarHandler(realStar);
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] { Star.class },
				handler);
		proxy.confer();
		proxy.sing();
	}
}
