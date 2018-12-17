package javalessons5.gof23.demo15mediator;

public interface Mediator {
	void register(String dname, Department d);

	void command(String dname);

}
