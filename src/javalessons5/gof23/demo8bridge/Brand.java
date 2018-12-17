package javalessons5.gof23.demo8bridge;

public interface Brand {
	void sale();
}

class Lenovo implements Brand {

	@Override
	public void sale() {
		System.out.println("sale lenovo");

	}

}

class Dell implements Brand {

	@Override
	public void sale() {
		System.out.println("sale Dell");

	}

}
