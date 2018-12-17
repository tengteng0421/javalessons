package javalessons5.gof23.demo8bridge;

public class Client {
	public static void main(String[] args) {
		Computer c = new Desktop(new Lenovo());
		c.sale();
	}
}
