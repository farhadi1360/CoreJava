package ir.edu.farhadi.java.j12.designpatern.strategy;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Database implements ServiceBus{
    @Override
    public void readDate() {
        System.out.println("Read All Data From Databases");
    }
}
