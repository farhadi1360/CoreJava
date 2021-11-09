package ir.edu.farhadi.java.j4;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class SampleFinalAndStatic {

    // we can initiating by direction way
    private final static String SYSTEM_NAME = "NOCR";

    private final static int SYSTEM_CODE;

    private final static String IP = getIP();

    static {
        SYSTEM_CODE = 100;
    }

    /*
     * we can not use this way because its possible we have not an object
     * {
     * SYSTEM_CODE =100;
     * *
     * }
     * and also we can not use constructor because its possible we have not an object
     */
//    SampleFinalAndStatic() {
//        SYSTEM_CODE = 14;
//    }

    /**
     * we can use a static method for returning value to static field
     * @return
     */
    private static String getIP() {
        return "192.168.0.01";
    }

}
