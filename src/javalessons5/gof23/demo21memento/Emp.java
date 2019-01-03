package javalessons5.gof23.demo21memento;

/**
 * 源发器类
 * 
 * @author Teng-Dell
 *
 */
public class Emp {
	private String name;
	private int age;
	private double salary;

	// 备忘操作，返回备忘对象
	public EmpMemento memento() {
		return new EmpMemento(this);
	}

	// 恢复操作，恢复成制定备忘录的值
	public void recovery(EmpMemento em) {
		this.name = em.getName();
		this.age = em.getAge();
		this.salary = em.getSalary();
	}

	public Emp(String name, int age, double salary) {
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
