package javalessons5.gof23.demo4factory.interfacefactory;

public interface EngineInterface {
	void run();

	void start();
}

class LuxuryEngine implements EngineInterface {

	@Override
	public void run() {
		System.out.println("luxury engine run");

	}

	@Override
	public void start() {
		System.out.println("luxury engine start");

	}

}

class LowEngine implements EngineInterface {

	@Override
	public void run() {
		System.out.println("low engine run");

	}

	@Override
	public void start() {
		System.out.println("low engine start");

	}

}
