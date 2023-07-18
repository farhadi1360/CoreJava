package ir.edu.farhadi.java.j6;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Overriding extends Boss{

    public Overriding() {
    }

    public Overriding(int range) {
        super(range);
    }

    public static void main(String[] args) {
        Overriding overriding = new Overriding();
        overriding.doSomeThings();
        overriding.test2();
    }

    /**
     * i have to define a strong modifier than to original modifier
     * as you can see in originally method i have package modifier for  doSomeThings method
     * but in children when i want to override parent method i have to define upper than access modifier
     * like public
     * also as yoc can  see  implement of the method can changing by new implement which we say overriding
     */
    protected void doSomeThings(){
        System.out.println("Overriding doSomeThings");
    }

    @Override
    public void test2() {

        super.test2();

        System.out.println("asdasd");
    }


}
