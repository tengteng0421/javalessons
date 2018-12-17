package javalessons5.gof23.demo5builder;

import javalessons5.gof23.demo4factory.interfacefactory.TypeInterface;

public class MyType implements TypeInterface {

	public MyType() {
		stopLength();
	}

	@Override
	public void stopLength() {
		System.out.println("type stoplength 20m");

	}

}
