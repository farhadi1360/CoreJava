package ir.edu.farhadi.java.j19.dynamicproxy.usecase;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE )
public @interface TrafficNet {
     String value();
}
