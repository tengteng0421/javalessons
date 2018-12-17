package javalessons5.gof23.demo;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonDemo1 implements Serializable {
	/**
	 * 饿汉式 1.私有构造器 2.私有静态对象初始化 3.提供调用方法
	 */
	private static final SingletonDemo1 s = new SingletonDemo1();

	private SingletonDemo1() {
		if (s != null) {
			throw new RuntimeException("");
		}
	}

	public static SingletonDemo1 getInstance() {// 不用线程同步，因为初始化已经有对象了；不用同步，调用效率高，是天然线程安全的。
		// 但是，无法延时加载
		return s;
	}

	// 防止单例反序列化创建多个对象
	private Object readResolve() throws ObjectStreamException {
		return s;

	}
}
