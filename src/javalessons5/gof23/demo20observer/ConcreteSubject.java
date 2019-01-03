package javalessons5.gof23.demo20observer;

public class ConcreteSubject extends Subject {
	private int state;

	public void setState(int state) {
		this.state = state;
		this.notifyAllObservers();
	}

	public int getState() {
		return this.state;
	}
}
