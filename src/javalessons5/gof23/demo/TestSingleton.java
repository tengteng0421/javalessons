package javalessons5.gof23.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleton {
	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		// EnumSingleton.INSTANCE.operation();
		// 反射破解单例
		Class<SingletonDemo1> clsDemo1 = (Class<SingletonDemo1>) Class
				.forName("javalessons5.gof23.demo.SingletonDemo1");
		Constructor<SingletonDemo1> constructor = clsDemo1.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		SingletonDemo1 instance = SingletonDemo1.getInstance();
		// SingletonDemo1 newInstance = constructor.newInstance();
		// SingletonDemo1 newInstance2 = constructor.newInstance();
		// 解决方式：私有构造中，若创建多个，抛出异常
		// System.out.println(newInstance + " " + newInstance2);

		// 通过反序列化构造多个对象
		// 序列化
		File f = new File("d:/a.txt");
		f.createNewFile();
		FileOutputStream fos = new FileOutputStream("d:/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(instance);

		oos.close();
		fos.close();

		// 反序列化
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
		SingletonDemo1 sd1 = (SingletonDemo1) ois.readObject();
		System.out.println(instance + " " + sd1);
		// 解决方式：定义readResolve()方法

	}
}
