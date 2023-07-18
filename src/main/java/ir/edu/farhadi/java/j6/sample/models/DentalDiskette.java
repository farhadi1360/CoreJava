package ir.edu.farhadi.java.j6.sample.models;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class DentalDiskette extends Diskette{


    public DentalDiskette(String name, long price) {
        super(name, price);
    }


    public  void calculateInsurance() {
        float insuranceRate = 0.9f;
        System.out.println("calculateInsurance was called on DentalDiskette");
    }

}
