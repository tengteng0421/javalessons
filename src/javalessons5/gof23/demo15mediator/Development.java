package javalessons5.gof23.demo15mediator;

public class Development implements Department {

	private Mediator m;

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("��������");

	}

	@Override
	public void outAction() {
		System.out.println("������Ҫ�ʽ�");
	}

	public Development(Mediator m) {
		super();
		this.m = m;
		m.register("development", this);
	}

}
