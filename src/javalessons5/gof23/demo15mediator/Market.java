package javalessons5.gof23.demo15mediator;

public class Market implements Department {

	private Mediator m;

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("Ѱ�ҿͻ�");

	}

	@Override
	public void outAction() {
		System.out.println("�г�����Ҫ֧��");
		m.command("finacial");
	}

	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);
	}

}
