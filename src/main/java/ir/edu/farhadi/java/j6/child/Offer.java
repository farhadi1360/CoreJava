package ir.edu.farhadi.java.j6.child;

import ir.edu.farhadi.java.j6.Boss;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Offer extends Boss {

    /**
     * in this sample i am going to show how subclass can access to protected filed like "salary"
     * in hierarchy inheriting
     */
    public Offer() {
        System.out.println("Constructor Of Offer was called   ");
    }

    public void calculate() {

        System.out.println("calculate Of Offer was called   ");
    }

}
