package javalessons5.gof23.demo10decorator;

public interface ICar {
	void move();
}

class Car implements ICar {

	@Override
	public void move() {
		System.out.println("run on land");
	}
}

class SuperCar implements ICar {

	protected ICar icar;

	public SuperCar(ICar icar) {
		this.icar = icar;
	}

	@Override
	public void move() {
		icar.move();
	}
}

class FlyCar extends SuperCar {

	public FlyCar(ICar icar) {
		super(icar);
	}

	public void fly() {
		System.out.println("fly in the sky");
	}

	@Override
	public void move() {
		fly();
		super.move();
	}
}

class SwimCar extends SuperCar {

	public SwimCar(ICar icar) {
		super(icar);
	}

	public void swim() {
		System.out.println("swim in the lake");
	}

	@Override
	public void move() {
		swim();
		super.move();
	}
}