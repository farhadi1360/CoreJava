package ir.edu.farhadi.java.j12.designpatern.proxy;

import java.io.File;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class AmazonMediaManagement implements Media {

    @Override
    public void uploadingToS3Services(File file) {
        System.out.println("Uploading was success to S3 Amazon");
    }
}
