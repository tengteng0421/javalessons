package javalessons5.gof23.demo16command;

public class Invoker {
	private Command command;// ���Զ������ ������������

	public Invoker(Command command) {
		super();
		this.command = command;
	}

	public void call() {
		command.execute();
	}
}
