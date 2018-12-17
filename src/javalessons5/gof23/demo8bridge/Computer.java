package javalessons5.gof23.demo8bridge;

public abstract class Computer {
	protected Brand brand;

	public Computer(Brand brand) {
		this.brand = brand;
	}

	public void sale() {
		brand.sale();
	}
}

class Desktop extends Computer {

	public Desktop(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sale() {
		System.out.println("sale desktop");
		super.sale();
	}

}
