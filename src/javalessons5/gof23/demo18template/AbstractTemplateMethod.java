package javalessons5.gof23.demo18template;

public abstract class AbstractTemplateMethod {
	public void fun1() {
		System.out.println("fun 1 run");
	}

	public abstract void fun2();

	public void fun3() {
		System.out.println("fun 3 run");
	}

	public void process() {
		fun1();
		fun2();
		fun3();
	}
}
