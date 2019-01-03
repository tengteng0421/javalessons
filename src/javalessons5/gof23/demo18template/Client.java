package javalessons5.gof23.demo18template;

public class Client {
	public static void main(String[] args) {
		AbstractTemplateMethod m = new AbstractTemplateMethod() {

			@Override
			public void fun2() {
				System.out.println("save fun2 run");

			}
		};

		m.process();
	}
}
