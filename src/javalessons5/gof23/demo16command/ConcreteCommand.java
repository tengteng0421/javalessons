package javalessons5.gof23.demo16command;

public class ConcreteCommand implements Command {

	private Receiver r;

	@Override
	public void execute() {
		// ����ǰ�����ִ��������ش���
		r.action();

	}

	public ConcreteCommand(Receiver r) {
		super();
		this.r = r;
	}

}
