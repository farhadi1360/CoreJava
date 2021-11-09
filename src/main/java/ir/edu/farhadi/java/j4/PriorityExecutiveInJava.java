package ir.edu.farhadi.java.j4;

/*
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class PriorityExecutiveInJava {
    int f = 10;
    static int s;

    final static int fs;

    {
        System.out.println("Run Init Block Per Object Creation");
    }

    static {
        fs = 15;
        System.out.println("Run Static Block Only once of Object Creation");
    }

    public PriorityExecutiveInJava() {

        System.out.println("Run Constructor  per Object Creation");
    }

    {
        System.out.println("Run Init Block Per Object Creation");
    }

    void testNonStaticMethod() {
        System.out.println("Run Non Static Method use Object");
    }

    static void testStaticMethod() {
        System.out.println("Run  Static Method without use Object");
    }
}
