package ir.edu.farhadi.java.j5.pattern.singlton;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public final class SingeObject2 {
    private SingeObject2() {}

    private final  String name="Mosgtafa";
    private final int x=10;
    private final static SingeObject2 instance = new SingeObject2();



    public static SingeObject2 getInstance() {
        return instance;
    }
    public  void log(String msg){
        System.out.println("Logger : " .concat(msg));
    }
}
