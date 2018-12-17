package javalessons5.gof23.demo5prototype;

import java.util.Date;

public class Sheep implements Cloneable {
	private String name;
	private Date birthday;

	public Sheep(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 为了实现深复制，添加如下代码
		Sheep clone = (Sheep) super.clone();
		this.birthday = (Date) clone.birthday.clone();
		return clone;
	}

	public void printInfo() {
		System.out.println(name + " " + birthday);
	}
}
