package javalessons5.gof23.demo;

public class InnerStatic {
	/**
	 * 1. ��̬�ڲ��� 2. ����˽��
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
	 * ǧ��Ҫ��
	 */
	private InnerStatic() {

	}
}
