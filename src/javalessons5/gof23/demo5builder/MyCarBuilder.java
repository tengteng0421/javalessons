package javalessons5.gof23.demo5builder;

import javalessons5.gof23.demo4factory.interfacefactory.EngineInterface;
import javalessons5.gof23.demo4factory.interfacefactory.SeatInterface;
import javalessons5.gof23.demo4factory.interfacefactory.TypeInterface;

public class MyCarBuilder implements CarBuilder {

	@Override
	public EngineInterface buildEngine() {

		return new MyEngine();
	}

	@Override
	public TypeInterface buildType() {
		// TODO Auto-generated method stub
		return new MyType();
	}

	@Override
	public SeatInterface buildSeat() {
		// TODO Auto-generated method stub
		return new MySeat();
	}

}
