package javalessons4.reflection.test.demo;

public class User implements Userable {
	private int id;
	private int age;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}

	@Override
	public void say() {
		System.out.println("say");

	}

	@Override
	public void cry() {
		System.out.println("cry");

	}
}
