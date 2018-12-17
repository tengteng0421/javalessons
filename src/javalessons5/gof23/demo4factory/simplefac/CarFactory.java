package javalessons5.gof23.demo4factory.simplefac;

public class CarFactory {
	public static Car CreateCar(String type) {
		if ("car1".equals(type)) {
			return new Car1();
		} else if ("car1".equals(type)) {
			return new Car2();
		}
		return null;
	}
}
