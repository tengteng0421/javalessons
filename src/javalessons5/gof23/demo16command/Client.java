package javalessons5.gof23.demo16command;

public class Client {
	public static void main(String[] args) {
		Command c = new ConcreteCommand(new Receiver());
		Invoker i = new Invoker(c);
		i.call();
	}
}
