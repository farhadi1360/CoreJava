package ir.edu.farhadi.java.j12.designpatern.proxy;

import java.io.File;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class AmazonProxy implements Media {

    private Media s3Service = new AmazonMediaManagement();

    @Override
    public void uploadingToS3Services(File file) {
        System.out.println("set all our config ");
        System.out.println("set all security ");
        s3Service.uploadingToS3Services(file);
        System.out.println("set all security ");
        System.out.println("set all security ");
    }
}
