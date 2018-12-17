package javalessons5.gof23.demo15mediator;

public class Market implements Department {

	private Mediator m;

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("寻找客户");

	}

	@Override
	public void outAction() {
		System.out.println("市场部需要支持");
		m.command("finacial");
	}

	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);
	}

}
