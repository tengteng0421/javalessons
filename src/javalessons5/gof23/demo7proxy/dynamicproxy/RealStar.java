package javalessons5.gof23.demo7proxy.dynamicproxy;

public class RealStar implements Star {

	@Override
	public void confer() {
		System.out.println("realstar confer");

	}

	@Override
	public void signContract() {
		System.out.println("realstar signContract");

	}

	@Override
	public void bookTicket() {
		System.out.println("realstar bookTicket");

	}

	@Override
	public void sing() {
		System.out.println("realstar sing");

	}

	@Override
	public void collectMoney() {
		System.out.println("realstar collectMoney");

	}

}
