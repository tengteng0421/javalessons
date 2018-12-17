package javalessons3.server.����;

import java.lang.reflect.InvocationTargetException;

public class ReflectionTest1 {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		// ���ַ��䷽ʽ
		// 1 ����.getClass()
		Class<? extends Iphone> class1 = new Iphone().getClass();
		// 2 ��.class()
		Class<Iphone> cla = Iphone.class;
		// 3 Class.forName("����.����");
		Class<?> clz = Class.forName("javalessons3.server.����.Iphone");
		// 3.1 ��̬��������
		Iphone newInstance = (Iphone) clz.newInstance();//
		// java1.9���ϲ�����÷�ʽ������ȫ
		System.out.println(newInstance);
		// java1.9����ʹ�ù�����
		// clz.getConstructor().newInstance("����");
		Iphone newInstance2 = (Iphone) clz.getConstructor(int.class).newInstance(2);

		// �ŵ�: д�ýӿ���,֮��ͨ�������ļ�����, ʵ������
	}
}

class Iphone {
	public Iphone() {

	}

	public Iphone(int i) {
		System.out.println(i);
	}
}
