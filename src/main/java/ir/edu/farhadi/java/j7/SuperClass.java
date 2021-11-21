package ir.edu.farhadi.java.j7;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class SuperClass {

    protected void defaultCalculate() {
        System.out.println(" This is defaultCalculate on SuperClass");
    }

    public Number getSum(int a , int b) {
        return a + b;
    }

    protected void doIt(){
        System.out.println(" This is doIt method on SuperClass");
    }

    protected final void checkSecurity() {
        System.out.println(" This is checkSecurity method on SuperClass");
    }
    public static void log(){
        System.out.println(" This is log method on SuperClass");
    }
}
