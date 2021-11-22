package ir.edu.farhadi.java.j6.sample.models;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public final class RootCanal extends DentalDiskette{
    public RootCanal(String name, long price) {
        super(name, price);
    }

    @Override
    public final void calculateInsurance() {
        float insuranceRate = 0.15f;
        setPrice((long) (getPrice() * insuranceRate));
        System.out.println("Calculate Insurance For RootCanal is "+getPrice());
    }
}
