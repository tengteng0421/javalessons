package javalessons5.gof23.demo;

public class SingletonDemo2 {
	/**
	 * ����ʽ 1.��ʼ������������ 2.˽�л������� 3.�߳�ͬ����ȡ����
	 */
	private static SingletonDemo2 s = null;

	private SingletonDemo2() {

	}

	public static synchronized SingletonDemo2 getInstance() {// ��Դ�����ʸ��ˣ����ǣ�ÿ�ε���getInstance()��Ҫͬ��
		if (s == null) {
			s = new SingletonDemo2();
		}
		return s;
	}
}
