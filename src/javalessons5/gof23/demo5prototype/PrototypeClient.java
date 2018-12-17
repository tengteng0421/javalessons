package javalessons5.gof23.demo5prototype;

import java.util.Date;

public class PrototypeClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		String name = "Ст1";
		Date d = new Date(1998, 4, 21);
		Sheep s1 = new Sheep(name, d);
		Sheep clone = (Sheep) s1.clone();
		name = "Ст2";
		clone.setName(name);
		d.setTime(new Date().getTime());
		clone.setBirthday(d);
		s1.printInfo();
		clone.printInfo();

	}

}
