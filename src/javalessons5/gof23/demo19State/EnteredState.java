package javalessons5.gof23.demo19State;

/**
 * 已入住
 * 
 * @author Teng-Dell
 *
 */
public class EnteredState implements State {

	@Override
	public void handle() {
		System.out.println("已入住，勿打扰");

	}

}
