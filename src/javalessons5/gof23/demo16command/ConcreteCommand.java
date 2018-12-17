package javalessons5.gof23.demo16command;

public class ConcreteCommand implements Command {

	private Receiver r;

	@Override
	public void execute() {
		// 命令前后可以执行其他相关处理
		r.action();

	}

	public ConcreteCommand(Receiver r) {
		super();
		this.r = r;
	}

}
