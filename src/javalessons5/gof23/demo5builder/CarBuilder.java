package javalessons5.gof23.demo5builder;

import javalessons5.gof23.demo4factory.interfacefactory.EngineInterface;
import javalessons5.gof23.demo4factory.interfacefactory.SeatInterface;
import javalessons5.gof23.demo4factory.interfacefactory.TypeInterface;

public interface CarBuilder {
	EngineInterface buildEngine();

	TypeInterface buildType();

	SeatInterface buildSeat();
}
