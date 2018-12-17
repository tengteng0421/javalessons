package javalessons5.gof23.demo5builder;

public class BuildClient {
	public static void main(String[] args) {
		DirectorInterface director = new CarDirector();
		director.directMycar(new MyCarBuilder());

	}

}
