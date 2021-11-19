package ir.edu.farhadi.java.j6;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Overriding extends Boss{

    public static void main(String[] args) {
        Overriding overriding = new Overriding();
        overriding.doSomeThings();
    }

    /**
     * i have to define a strong modifier than to original modifier
     * as you can see in originally method i have package modifier for  doSomeThings method
     * but in children when i want to override parent method i have to define upper than access modifier
     * like public
     * also as yoc can  see  implement of the method can changing by new implement which we say overriding
     */
    public void doSomeThings(){
        System.out.println("Overriding doSomeThings");
    }
}
