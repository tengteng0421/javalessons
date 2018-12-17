package javalessons5.gof23.demo4factory.simplefac;

public class CarClient {
	public static void main(String[] args) {
		/*
		 * 无工厂时， 创建方式
		 */
		Car c1 = new Car1();
		Car c2 = new Car2();
		/*
		 * 简单工厂模式下
		 */
		Car c3 = CarFactory.CreateCar("car1");
		Car c4 = CarFactory.CreateCar("car2");
	}
}
