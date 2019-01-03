package javalessons5.gof23.demo20observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> list = new ArrayList<>();

	public void register(Observer o) {
		list.add(o);
	}

	public void remove(Observer o) {
		list.remove(o);
	}

	public void notifyAllObservers() {
		for (Observer o : list) {
			o.update(this);
		}
	}
}
