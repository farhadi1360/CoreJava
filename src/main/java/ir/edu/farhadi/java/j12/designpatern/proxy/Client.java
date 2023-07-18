package ir.edu.farhadi.java.j12.designpatern.proxy;


import java.io.File;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Client {
    public static void main(String[] args) {
        File file = null;

        Media media = MediaFactory.getS3Service();

        media.uploadingToS3Services(file);


    }
}
