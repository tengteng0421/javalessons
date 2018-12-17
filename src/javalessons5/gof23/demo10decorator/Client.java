package javalessons5.gof23.demo10decorator;

public class Client {
	public static void main(String[] args) {
		ICar car = new Car();

		SuperCar c = new FlyCar(car);
		SuperCar c2 = new SwimCar(c);
		c2.move();
		c.move();
	}
}
