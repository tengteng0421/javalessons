package javalessons5.gof23.demo15mediator;

public class Client {
	public static void main(String[] args) {
		Mediator m = new President();
		Market mar = new Market(m);
		Development d = new Development(m);
		Finacial f = new Finacial(m);
		mar.outAction();
	}
}
