package javalessons5.gof23.demo16command;

public class Invoker {
	private Command command;// 可以多条命令， 用容器包起来

	public Invoker(Command command) {
		super();
		this.command = command;
	}

	public void call() {
		command.execute();
	}
}
