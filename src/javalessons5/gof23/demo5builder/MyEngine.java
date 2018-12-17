package javalessons5.gof23.demo5builder;

import javalessons5.gof23.demo4factory.interfacefactory.EngineInterface;

public class MyEngine implements EngineInterface {

	public MyEngine() {
		start();
		run();
	}

	@Override
	public void run() {
		System.out.println("myEngine run");

	}

	@Override
	public void start() {
		System.out.println("myEnging start");

	}

}
