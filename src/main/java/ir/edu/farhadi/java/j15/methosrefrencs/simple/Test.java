package ir.edu.farhadi.java.j15.methosrefrencs.simple;

import java.util.function.Consumer;


@FunctionalInterface
interface MyInterface{
    void display();
}

public class Test {

    public void myMethod(){
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        // Method reference using the object of the class
        MyInterface ref = obj::myMethod;
        // Calling the method of functional interface
        ref.display();
    }
}
