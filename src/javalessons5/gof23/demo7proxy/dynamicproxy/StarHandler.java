package javalessons5.gof23.demo7proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
	private Star realStar;

	public StarHandler(Star star) {
		this.realStar = star;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before " + method.getName() + " run");
		Object object = null;
		if (method.getName().equals("sing")) {
			object = method.invoke(realStar, args);
		}
		System.out.println("after " + method.getName() + " run");
		return object;
	}

}
