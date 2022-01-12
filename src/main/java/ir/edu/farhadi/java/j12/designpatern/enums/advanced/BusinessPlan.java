package ir.edu.farhadi.java.j12.designpatern.enums.advanced;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public enum BusinessPlan {

    GOLD(20000){
        int calculatePrice(){
            return price * 10 / 100;
        }
    },
    SILVER(15000){
        int calculatePrice(){
            return price * 5 / 100;
        }
    }
    ;
    BusinessPlan(int price) {
        this.price = price;
    }

    int price;


    abstract int calculatePrice();
}
