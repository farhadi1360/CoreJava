package ir.edu.farhadi.java.j11.contract;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class CXF implements Contract {
    @Override
    public void readText() {
        System.out.println("Read Text By CXF");
    }

    @Override
    public void parseText() {
        System.out.println("Parse Text By CXF");
    }

    @Override
    public void binding() {
        System.out.println("Bind Text By CXF");
    }

    @Override
    public void execute() {
        System.out.println("execute Text By CXF");
    }
}
