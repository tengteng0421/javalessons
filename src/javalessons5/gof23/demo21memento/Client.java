package javalessons5.gof23.demo21memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		Emp e = new Emp("tt", 18, 1150);

		System.out.println("第一个对象：" + e.getName() + " " + e.getAge() + " " + e.getSalary());

		// 备忘
		taker.setEmpmemento(e.memento());

		e.setName("ww");
		e.setAge(20);
		e.setSalary(4000);
		System.out.println("第二个对象：" + e.getName() + " " + e.getAge() + " " + e.getSalary());

		e.recovery(taker.getEmpmemento());
		System.out.println("第三个对象：" + e.getName() + " " + e.getAge() + " " + e.getSalary());
	}
}
