package javalessons3.server.反射;

import java.lang.reflect.InvocationTargetException;

public class ReflectionTest1 {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		// 三种反射方式
		// 1 对象.getClass()
		Class<? extends Iphone> class1 = new Iphone().getClass();
		// 2 类.class()
		Class<Iphone> cla = Iphone.class;
		// 3 Class.forName("包名.类名");
		Class<?> clz = Class.forName("javalessons3.server.反射.Iphone");
		// 3.1 动态创建对象
		Iphone newInstance = (Iphone) clz.newInstance();//
		// java1.9以上不建议该方式，不安全
		System.out.println(newInstance);
		// java1.9以上使用构造器
		// clz.getConstructor().newInstance("参数");
		Iphone newInstance2 = (Iphone) clz.getConstructor(int.class).newInstance(2);

		// 优点: 写好接口类,之后通过配置文件调用, 实例化类
	}
}

class Iphone {
	public Iphone() {

	}

	public Iphone(int i) {
		System.out.println(i);
	}
}
