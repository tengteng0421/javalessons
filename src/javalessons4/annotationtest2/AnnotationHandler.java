package javalessons4.annotationtest2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationHandler {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("javalessons4.annotationtest2.Student");
			Annotation[] annotations = clazz.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(annotation);

			}
			MyTable annotation = clazz.getAnnotation(MyTable.class);
			System.out.println(annotation.value());
			Field field = clazz.getDeclaredField("id");
			MyField myField = field.getAnnotation(MyField.class);
			System.out.println(myField.columnName() + " " + myField.type() + " " + myField.length());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
