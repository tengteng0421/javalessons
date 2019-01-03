package javalessons5.gof23.demo20observer2;

public class Client {

	public static void main(String[] args) {
		ConcreteSubject cs = new ConcreteSubject();
		// 创建观察者
		ObserverA a = new ObserverA();
		ObserverA b = new ObserverA();
		ObserverA c = new ObserverA();
		// 加入subject容器中
		cs.addObserver(a);
		cs.addObserver(b);
		cs.addObserver(c);
		// 改变subject状态
		cs.set(3000);
		System.out.println(a.getMyState());
		System.out.println(b.getMyState());
		System.out.println(c.getMyState());
	}

}
