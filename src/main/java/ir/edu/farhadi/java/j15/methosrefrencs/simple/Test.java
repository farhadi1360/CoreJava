package ir.edu.farhadi.java.j15.methosrefrencs.simple;

import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
        Consumer consumer = System.out::print;
        String name = "Shervin";
        test(consumer,name);
    }



    public static void test(Consumer consumer,String arg) {
        consumer.accept(arg);
    }
}
