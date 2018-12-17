package javalessons5.gof23.demo;

public class InnerStatic {
	/**
	 * 1. 静态内部类 2. 构造私有
	 * 
	 * @author Teng-Dell
	 *
	 */
	private static class InnerStaticInstance {
		private static final InnerStatic instance = new InnerStatic();
	}

	public static InnerStatic getInstance() {
		return InnerStaticInstance.instance;
	}

	/**
	 * 千万不要忘
	 */
	private InnerStatic() {

	}
}
