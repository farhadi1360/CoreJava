package ir.edu.farhadi.java.j11.polimorphism;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public interface TransferMangerInterface {
    abstract void transfer();

    default void log(){
        System.out.println("Log");
    }
}
