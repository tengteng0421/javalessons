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
		// �����ƽⵥ��
		Class<SingletonDemo1> clsDemo1 = (Class<SingletonDemo1>) Class
				.forName("javalessons5.gof23.demo.SingletonDemo1");
		Constructor<SingletonDemo1> constructor = clsDemo1.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		SingletonDemo1 instance = SingletonDemo1.getInstance();
		// SingletonDemo1 newInstance = constructor.newInstance();
		// SingletonDemo1 newInstance2 = constructor.newInstance();
		// �����ʽ��˽�й����У�������������׳��쳣
		// System.out.println(newInstance + " " + newInstance2);

		// ͨ�������л�����������
		// ���л�
		File f = new File("d:/a.txt");
		f.createNewFile();
		FileOutputStream fos = new FileOutputStream("d:/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(instance);

		oos.close();
		fos.close();

		// �����л�
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
		SingletonDemo1 sd1 = (SingletonDemo1) ois.readObject();
		System.out.println(instance + " " + sd1);
		// �����ʽ������readResolve()����

	}
}
