package javalessons5.gof23.demo15mediator;

public class Finacial implements Department {

	private Mediator m;

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("财务发工资");

	}

	@Override
	public void outAction() {
		System.out.println("财务没钱了");
	}

	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.register("finacial", this);
	}

}
