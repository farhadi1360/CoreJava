package ir.edu.farhadi.java.j4;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class SampleStaticMethods {
    int abc;

    void nonStaticMethod() {

    }

    /**
     * we can not use this keywords on all static methods. but we recommend you
     * if you want to use static method you can use in this way
     * classname.nameOfStaticMethod()
     * for example SampleStaticMethods.test();
     * Of course we can create object then use the method but its recommended for non static methods
     * <p>
     * all of the static methods can be overload and not can be overridden so thats lead to we can not using polymorphism in
     * static methods
     */


    public static void test() {
        /**
         * in static method you can not access to non static fields or methods
         */
//        this.abc=20;
//        nonStaticMethod();
/**
 * i just use only this way for access to nonstatic methods i means creation object
 */

//        SampleStaticMethods sampleStaticMethods = new SampleStaticMethods();
//        sampleStaticMethods.nonStaticMethod();
    }
}
