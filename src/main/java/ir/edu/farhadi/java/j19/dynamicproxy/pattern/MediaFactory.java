package ir.edu.farhadi.java.j19.dynamicproxy.pattern;


/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class MediaFactory {

    private MediaFactory(){}

    public static Media getS3Service() {
        return (Media) AmazonInvocationHandler.getDynamicProxy(new AmazonMediaManagement());
    }
}
