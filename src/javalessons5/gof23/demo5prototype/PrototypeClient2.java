package javalessons5.gof23.demo5prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class PrototypeClient2 {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		String name = "Ст1";
		Date d = new Date(1998, 4, 21);
		Sheep2 s1 = new Sheep2(name, d);

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] byteArray = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(byteArray);
		ObjectInputStream ois = new ObjectInputStream(bis);
		d.setTime(0);
		Sheep2 s2 = (Sheep2) ois.readObject();

		// Sheep clone = (Sheep) s1.clone();
		// name = "Ст2";
		// clone.setName(name);
		// d.setTime(new Date().getTime());
		// clone.setBirthday(d);
		s1.printInfo();
		s2.printInfo();

	}

}
