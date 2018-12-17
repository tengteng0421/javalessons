package javalessons5.gof23.demo9composite;

public class Client {
	public static void main(String[] args) {
		Folder f1 = new Folder("f1");
		AbstractFile f2 = new ImageFile("f2");
		AbstractFile f3 = new ImageFile("f3");
		AbstractFile f4 = new ImageFile("f4");
		Folder f5 = new Folder("f5");
		Folder f6 = new Folder("f6");

		f1.add(f2);
		f1.add(f3);
		f1.add(f4);
		f1.add(f5);
		f5.add(f6);
		f1.killVirus();

	}
}
