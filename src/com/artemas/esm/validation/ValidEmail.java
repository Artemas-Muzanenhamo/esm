package com.artemas.esm.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({ METHOD, FIELD, ANNOTATION_TYPE })//where you can use this annotation.
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = com.artemas.esm.validation.ValidEmailImpl.class) //specify a class that will contain the code behind this @annotation.
public @interface ValidEmail {

	String message() default "This does not appear to be an email address.";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
	int min() default 5;
	int max() default 50;
}
