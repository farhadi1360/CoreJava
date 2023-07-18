package ir.edu.farhadi.java.j9;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Child extends Parent {

    public Child(int a) {
        super(a);
    }

    public static void main(String[] args) {
        Child child = new Child(10);
        System.out.println(child.getA());
    }
}
