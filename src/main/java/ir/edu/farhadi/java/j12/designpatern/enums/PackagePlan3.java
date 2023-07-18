package ir.edu.farhadi.java.j12.designpatern.enums;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public enum PackagePlan3 {

    GOLD(100) , SILVER(50)
    ;
    private int price;

    PackagePlan3(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
