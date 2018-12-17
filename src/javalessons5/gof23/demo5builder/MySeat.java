package javalessons5.gof23.demo5builder;

import javalessons5.gof23.demo4factory.interfacefactory.SeatInterface;

public class MySeat implements SeatInterface {

	public MySeat() {
		massage();
	}

	@Override
	public void massage() {
		System.out.println("my seat massage");

	}

}
