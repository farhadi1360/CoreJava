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
    public  void calculateInsurance() {
        float insuranceRate = 0.15f;
        setPrice((long) (getPrice() * insuranceRate));
        StringBuilder result = new StringBuilder();
        result.append("insuranceRate for RootChanel is : ")
                .append(insuranceRate)
                .append(" And Calculate Insurance For RootCanal is : ")
                .append(getPrice());
        System.out.println(result);
    }
}
