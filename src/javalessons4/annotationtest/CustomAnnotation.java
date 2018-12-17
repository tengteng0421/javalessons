package javalessons4.annotationtest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
	String student() default "";

	int age() default -1;

	String[] school() default { "school1", "school2" };
}
