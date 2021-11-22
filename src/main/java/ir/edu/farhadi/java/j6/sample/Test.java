package ir.edu.farhadi.java.j6.sample;

import ir.edu.farhadi.java.j6.sample.models.DentalDiskette;
import ir.edu.farhadi.java.j6.sample.models.DentalSurgery;
import ir.edu.farhadi.java.j6.sample.models.Diskette;
import ir.edu.farhadi.java.j6.sample.models.RootCanal;
import ir.edu.farhadi.java.j6.sample.services.DisketteService;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Test {
    public static void main(String[] args) {
        Diskette disketteOne = new DentalSurgery("DentalSurgery", 10500);
        Diskette disketteTwo = new RootCanal("RootCanal", 5000);
        DentalDiskette dentalSurgery = new DentalSurgery("DentalSurgery", 7800);
        DentalDiskette rootCanal = new RootCanal("RootCanal", 89000);
        DentalDiskette[] dentalDisketteList = {dentalSurgery, rootCanal};
        DisketteService disketteService = new DisketteService();


        for (DentalDiskette dentalDiskette : dentalDisketteList) {
            dentalDiskette.calculateInsurance();
        }


        /**
         * i try to show how can we use reference address in reusable code by service layer
         */
        disketteService.calculateSumPriceBetweenTwoDiskette(disketteOne,disketteTwo);


    }


}
