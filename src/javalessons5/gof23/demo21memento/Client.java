package javalessons5.gof23.demo21memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		Emp e = new Emp("tt", 18, 1150);

		System.out.println("��һ������" + e.getName() + " " + e.getAge() + " " + e.getSalary());

		// ����
		taker.setEmpmemento(e.memento());

		e.setName("ww");
		e.setAge(20);
		e.setSalary(4000);
		System.out.println("�ڶ�������" + e.getName() + " " + e.getAge() + " " + e.getSalary());

		e.recovery(taker.getEmpmemento());
		System.out.println("����������" + e.getName() + " " + e.getAge() + " " + e.getSalary());
	}
}
