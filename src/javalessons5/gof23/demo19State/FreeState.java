package javalessons5.gof23.demo19State;

/**
 * 空闲
 * 
 * @author Teng-Dell
 *
 */
public class FreeState implements State {

	@Override
	public void handle() {
		System.out.println("房间空闲，可以预订");

	}

}
