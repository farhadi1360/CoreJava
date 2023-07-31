package ir.edu.farhadi.java.j15.lombda.fanap.basic;

@FunctionalInterface
public interface Appender<T>{
    T append(T mem1, T mem2);
}
