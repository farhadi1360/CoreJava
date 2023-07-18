package ir.edu.farhadi.java.j12.designpatern.enums.advanced;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Test {

    public static void main(String[] args) {
        BusinessPlan goldPlan = BusinessPlan.GOLD;
        System.out.println(goldPlan.calculatePrice());
        BusinessPlan silverPlan = BusinessPlan.SILVER;
        System.out.println(silverPlan.calculatePrice());

    }
}
