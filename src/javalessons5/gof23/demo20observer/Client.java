package javalessons5.gof23.demo20observer;

public class Client {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		ObserverA a = new ObserverA();
		ObserverA b = new ObserverA();
		ObserverA c = new ObserverA();
		subject.register(a);
		subject.register(b);
		// subject.register(c);

		subject.setState(5000);
		System.out.println(a.getMyState());
		System.out.println(b.getMyState());
		System.out.println(c.getMyState());
	}
}
