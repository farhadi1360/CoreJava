package ir.edu.farhadi.java.j4;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 *
 * in this class i want show som sample of static concept
 * we can not use static in keyword on Class,Interface,Constructor and LocalVariable
 * and we just able to use that on method and type of variable
 */

public class Test {

    /*
     * as you can see we can not use static in LocalVariable
     * because we know all of the method in java has stack frame so the lifecycle of that  LocalVariable
     * is limited to end of method so that lead to static LocalVariable can not keep the value after end of method
     */
    private  void method1() {
    // static int a;
    }

    /*
        as you know all of the methods that needs to heap space which called instance methods
        so these are need to object of class for use.
        on the other hand we can have a methods or fields that no need to heap space .so that leads to you
        dont need to new keyword for create objects

        *********************STATIC******************
        if we have a static filed that is only take a place in memory for all objects
        to mack it clear i should say we dont required to create even one object .

        in fact  all of the static methods or fields are stored in the PermGen section of the heap
        an important note is that only the variables and their technical values (primitives or references) are stored in  in Metaspace space of native heap
        and actual objects are stored in normal heap space
        like this
        static int i = 1; //the value 1 is stored in the Metaspace
        static Object o = new SomeObject();//the reference(pointer/memory address) is stored in the Metaspace  section, the object itself is not.

        very important : The lifecycle of static fields is might be as process because there is not in heap and call stack
     */

    public static void main(String[] args) {
        // this way is correct
        SampleStatic.a = 100;
        SampleStatic sampleStatic1 = new SampleStatic();
        SampleStatic sampleStatic2 = new SampleStatic();
        SampleStatic sampleStatic3 = new SampleStatic();
        // i tried created 3 objects just for described how changes  static field on all objects

        System.out.println(sampleStatic1.a);
        System.out.println(sampleStatic2.a);
        System.out.println(sampleStatic3.a);
        sampleStatic2.a = 500;
        System.out.println(sampleStatic1.a);
        System.out.println(sampleStatic2.a);
        System.out.println(sampleStatic3.a);

    }

}
