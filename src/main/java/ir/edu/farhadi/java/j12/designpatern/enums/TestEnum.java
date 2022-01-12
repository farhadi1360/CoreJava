package ir.edu.farhadi.java.j12.designpatern.enums;

import java.awt.*;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class TestEnum {

    public static void main(String[] args) {

        PackagePlan2 plan1 = PackagePlan2.GOLD;
        PackagePlan2 plan2 = PackagePlan2.SILVER;
        if (plan1 == getPlan()) {
            System.out.println("these are seams");
        }else{
            System.out.println("these are not seams");
        }


    }


    private static PackagePlan2 getPlan() {
        PackagePlan2 plan = PackagePlan2.GOLD;
        return plan;
    }
}
