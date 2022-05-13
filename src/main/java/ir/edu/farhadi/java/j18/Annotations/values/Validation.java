package ir.edu.farhadi.java.j18.Annotations.values;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * there are some roles for definition elements
 * 1-The element cannot declare any parameters.
 * 2-The element cannot have a throws clause.
 * 3-The element cannot define a generic method <T>.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType. FIELD)
public @interface Validation {
    int min() default 0;
    int max() default 100;
 }
