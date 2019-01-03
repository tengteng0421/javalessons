package javalessons5.gof23.demo20observer2;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {

	private int myState;

	@Override
	public void update(Observable o, Object arg) {
		this.myState = ((ConcreteSubject) o).getState();

	}

	public int getMyState() {
		return myState;
	}

	public void setMyState(int myState) {
		this.myState = myState;
	}

}
