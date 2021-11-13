package ir.edu.farhadi.java.j5;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public final class SingeObject2 {
    private SingeObject2() {}

    private final static SingeObject2 getInstance = new SingeObject2();
    public static SingeObject2 getInstance() {
        return getInstance;
    }
}
