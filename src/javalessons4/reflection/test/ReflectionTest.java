package javalessons4.reflection.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javalessons4.reflection.test.demo.Userable;

public class ReflectionTest {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		String path = "javalessons4.reflection.test.demo.User";
		Class<Userable> clazz = (Class<Userable>) Class.forName(path);// �����ֻ��һ��
		Userable obj = clazz.getConstructor().newInstance();
		clazz.getDeclaredAnnotations();
		clazz.getDeclaredConstructors();
		clazz.getDeclaredFields();
		clazz.getDeclaredMethods();
		Method method = clazz.getDeclaredMethod("setName", String.class);
		method.invoke(obj, "teng");// ��� ���󣬷�������
		obj.cry();
		obj.say();
		Field field = clazz.getDeclaredField("age");
		field.setAccessible(true);// ��������ȫ���
		field.set(obj, 2);
		System.out.println(field.get(obj));
	}
}
