package ir.edu.farhadi.java.j6.sample.models;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Diskette {
    private String name;
    private long price;


    public Diskette(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Diskette{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
