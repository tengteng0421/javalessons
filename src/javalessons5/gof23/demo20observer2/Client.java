package javalessons5.gof23.demo20observer2;

public class Client {

	public static void main(String[] args) {
		ConcreteSubject cs = new ConcreteSubject();
		// �����۲���
		ObserverA a = new ObserverA();
		ObserverA b = new ObserverA();
		ObserverA c = new ObserverA();
		// ����subject������
		cs.addObserver(a);
		cs.addObserver(b);
		cs.addObserver(c);
		// �ı�subject״̬
		cs.set(3000);
		System.out.println(a.getMyState());
		System.out.println(b.getMyState());
		System.out.println(c.getMyState());
	}

}
