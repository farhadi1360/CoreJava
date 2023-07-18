package ir.edu.farhadi.java.j11.multipaile;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public interface HttpRest extends Protocol{


    @Override
    default void contractMode(){
        System.out.println("Default contract in Http Rest is JSON ");
    }

    static void rateLimit() {
        System.out.println("Rate Limit is 50 per request");
    }

//    final void test(){}
}
