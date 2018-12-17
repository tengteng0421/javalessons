package javalessons5.gof23.demo15mediator;

public class Finacial implements Department {

	private Mediator m;

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("���񷢹���");

	}

	@Override
	public void outAction() {
		System.out.println("����ûǮ��");
	}

	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.register("finacial", this);
	}

}
