package javalessons5.gof23.demo4factory.factorymethod;

import javalessons5.gof23.demo4factory.simplefac.Car;

public class FactoryMethodClient {
	/*
	 * 工厂方法模式
	 */
	public static void main(String[] args) {
		Car car1 = new Car1Factory().createCar();
		Car car2 = new Car2Factory().createCar();
	}
}
