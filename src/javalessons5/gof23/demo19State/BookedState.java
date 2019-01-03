package javalessons5.gof23.demo19State;

/**
 * 已预订
 * 
 * @author Teng-Dell
 *
 */
public class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("已预订，本人可入住，其他人不能预订");

	}

}
