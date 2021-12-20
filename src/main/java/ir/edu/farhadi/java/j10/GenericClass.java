package ir.edu.farhadi.java.j10;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 *
 * Generics type in java  brings After Java 1.5
 * use the diamond sign: <>
 * in generic we can pass type to class or methods while  before java 1.5 we have to use or pass only value of type
 */
public class GenericClass<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
