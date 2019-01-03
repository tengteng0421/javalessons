package javalessons5.gof23.demo19State;

public class Context {
	private State state;

	public void setState(State s) {
		this.state = s;
		System.out.println("ÐÞ¸Ä×´Ì¬");
		state.handle();
	}
}
