package javalessons5.gof23.demo15mediator;

public class Development implements Department {

	private Mediator m;

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("开发程序");

	}

	@Override
	public void outAction() {
		System.out.println("开发需要资金");
	}

	public Development(Mediator m) {
		super();
		this.m = m;
		m.register("development", this);
	}

}
