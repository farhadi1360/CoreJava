package ir.edu.farhadi.java.j11;

import ir.edu.farhadi.java.j11.multipaile.HttpRest;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Student {

    public Student() {
        System.out.println("Call Constructor");
    }
    {
        System.out.println("Call Init Block");
    }
    static {
        System.out.println("Call Static Block");

    }

    public static void main(String[] args) {
        Student student = new Student();
        HttpRest.rateLimit();

    }

}
