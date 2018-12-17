package javalessons5.gof23.demo;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonDemo1 implements Serializable {
	/**
	 * ����ʽ 1.˽�й����� 2.˽�о�̬�����ʼ�� 3.�ṩ���÷���
	 */
	private static final SingletonDemo1 s = new SingletonDemo1();

	private SingletonDemo1() {
		if (s != null) {
			throw new RuntimeException("");
		}
	}

	public static SingletonDemo1 getInstance() {// �����߳�ͬ������Ϊ��ʼ���Ѿ��ж����ˣ�����ͬ��������Ч�ʸߣ�����Ȼ�̰߳�ȫ�ġ�
		// ���ǣ��޷���ʱ����
		return s;
	}

	// ��ֹ���������л������������
	private Object readResolve() throws ObjectStreamException {
		return s;

	}
}
