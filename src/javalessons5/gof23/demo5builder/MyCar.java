package javalessons5.gof23.demo5builder;

import javalessons5.gof23.demo4factory.interfacefactory.EngineInterface;
import javalessons5.gof23.demo4factory.interfacefactory.SeatInterface;
import javalessons5.gof23.demo4factory.interfacefactory.TypeInterface;

public class MyCar {
	private EngineInterface engine;
	private TypeInterface type;
	private SeatInterface seat;

	public EngineInterface getEngine() {
		return engine;
	}

	public void setEngine(EngineInterface engine) {
		this.engine = engine;
	}

	public TypeInterface getType() {
		return type;
	}

	public void setType(TypeInterface type) {
		this.type = type;
	}

	public SeatInterface getSeat() {
		return seat;
	}

	public void setSeat(SeatInterface seat) {
		this.seat = seat;
	}

	public MyCar() {
		super();
	}

}
