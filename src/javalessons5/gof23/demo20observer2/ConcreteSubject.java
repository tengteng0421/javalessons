package javalessons5.gof23.demo20observer2;

import java.util.Observable;

public class ConcreteSubject extends Observable {
	private int state;

	public void set(int s) {
		this.state = s;

		setChanged();// ��ʾ���������˸���
		notifyObservers();// ֪ͨ���й۲���
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
