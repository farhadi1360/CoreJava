package ir.edu.farhadi.java.j3;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */

/*
 * as you know this design of class is basic design for all of the ImmutableClass
 * such as Integer , Long , ....
 */
public class ImmutableClass {

//    public ImmutableClass(){}

    // i defined final field for no changes
    private final int a;

    // created constructor for init final value
    public ImmutableClass(int a) {

        this.a = a;
    }

    // just defined getter method
    public int getA() {
        return a;
    }

    public static void main(String[] args) {
        sampleForImmutableClass();
    }

    /*
     * sample for ImmutableClass
     */
    public static void sampleForImmutableClass() {
        ImmutableClass im1 = new ImmutableClass(10);
        ImmutableClass im2 = new ImmutableClass(20);
        ImmutableClass im3 = new ImmutableClass(30);
        ImmutableClass im4 = new ImmutableClass(40);
        System.out.println(im1.getA());
        System.out.println(im2.getA());
        System.out.println(im3.getA());
        System.out.println(im4.getA());
    }
}
