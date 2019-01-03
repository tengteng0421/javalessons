package javalessons5.gof23.demo21memento;

/**
 * ±¸ÍüÂ¼Àà
 * 
 * @author Teng-Dell
 *
 */
public class EmpMemento {
	private String name;
	private int age;
	private double salary;

	public EmpMemento(Emp e) {
		this.name = e.getName();
		this.age = e.getAge();
		this.salary = e.getSalary();
	}

	public EmpMemento(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
