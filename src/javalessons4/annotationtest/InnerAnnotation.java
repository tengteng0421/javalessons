package javalessons4.annotationtest;

public class InnerAnnotation {

	@Override // ÄÚÖÃ×¢½â
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Deprecated
	@CustomAnnotation
	public void test() {

	}

	public static void main(String[] args) {
		InnerAnnotation i = new InnerAnnotation();
		i.test();
	}
}
