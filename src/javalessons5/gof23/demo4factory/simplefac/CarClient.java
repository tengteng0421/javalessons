package javalessons5.gof23.demo4factory.simplefac;

public class CarClient {
	public static void main(String[] args) {
		/*
		 * �޹���ʱ�� ������ʽ
		 */
		Car c1 = new Car1();
		Car c2 = new Car2();
		/*
		 * �򵥹���ģʽ��
		 */
		Car c3 = CarFactory.CreateCar("car1");
		Car c4 = CarFactory.CreateCar("car2");
	}
}
