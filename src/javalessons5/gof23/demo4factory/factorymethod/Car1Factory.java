package javalessons5.gof23.demo4factory.factorymethod;

import javalessons5.gof23.demo4factory.simplefac.Car;
import javalessons5.gof23.demo4factory.simplefac.Car1;

public class Car1Factory implements CarFactoryInterface {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Car1();
	}

}
