package ir.edu.farhadi.java.j6.sample.models;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public final class DentalSurgery extends DentalDiskette {

    public DentalSurgery(String name, long price) {
        super(name, price);
    }

    @Override
    public final void calculateInsurance() {
        float insuranceRate = 0.4f;
        setPrice((long) (getPrice() * insuranceRate));
        System.out.println("Calculate Insurance For DentalSurgery is "+getPrice());
    }
}
