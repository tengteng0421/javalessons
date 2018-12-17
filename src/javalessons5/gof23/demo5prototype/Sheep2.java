package javalessons5.gof23.demo5prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep2 implements Cloneable, Serializable {
	private String name;
	private Date birthday;

	public Sheep2(String name, Date birthday) {
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
		return super.clone();
	}

	public void printInfo() {
		System.out.println(name + " " + birthday);
	}
}
