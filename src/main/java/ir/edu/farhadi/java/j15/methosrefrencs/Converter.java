package ir.edu.farhadi.java.j15.methosrefrencs;



@FunctionalInterface
public interface Converter<E,D> {
    D convert (E entity);
}
