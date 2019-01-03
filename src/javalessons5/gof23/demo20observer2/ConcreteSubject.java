package javalessons5.gof23.demo20observer2;

import java.util.Observable;

public class ConcreteSubject extends Observable {
	private int state;

	public void set(int s) {
		this.state = s;

		setChanged();// 表示对象已做了更改
		notifyObservers();// 通知所有观察者
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
