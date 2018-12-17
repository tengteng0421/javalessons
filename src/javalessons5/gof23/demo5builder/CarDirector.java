package javalessons5.gof23.demo5builder;

import javalessons5.gof23.demo4factory.interfacefactory.EngineInterface;
import javalessons5.gof23.demo4factory.interfacefactory.SeatInterface;
import javalessons5.gof23.demo4factory.interfacefactory.TypeInterface;

public class CarDirector implements DirectorInterface {

	@Override
	public MyCar directMycar(CarBuilder build) {
		EngineInterface buildEngine = build.buildEngine();
		TypeInterface buildType = build.buildType();
		SeatInterface buildSeat = build.buildSeat();
		MyCar car = new MyCar();
		car.setEngine(buildEngine);
		car.setType(buildType);
		car.setSeat(buildSeat);
		return car;
	}

}
