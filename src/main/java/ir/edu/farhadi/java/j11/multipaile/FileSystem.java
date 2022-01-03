package ir.edu.farhadi.java.j11.multipaile;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public interface FileSystem extends Protocol {

    @Override
    default void contractMode(){
        System.out.println("Default contract in File System is XML ");
    }
}
