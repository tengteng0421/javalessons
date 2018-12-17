package javalessons5.gof23.demo;

public class SingletonDemo2 {
	/**
	 * 懒汉式 1.初始化不创建对象 2.私有化构造器 3.线程同步获取方法
	 */
	private static SingletonDemo2 s = null;

	private SingletonDemo2() {

	}

	public static synchronized SingletonDemo2 getInstance() {// 资源利用率高了，但是，每次调用getInstance()需要同步
		if (s == null) {
			s = new SingletonDemo2();
		}
		return s;
	}
}
