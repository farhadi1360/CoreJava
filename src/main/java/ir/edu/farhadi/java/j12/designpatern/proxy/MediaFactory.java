package ir.edu.farhadi.java.j12.designpatern.proxy;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class MediaFactory {
    private MediaFactory(){}
    public static Media getS3Service() {
        return new AmazonProxy();
    }
}
