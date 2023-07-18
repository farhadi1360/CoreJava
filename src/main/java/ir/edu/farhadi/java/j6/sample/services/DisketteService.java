package ir.edu.farhadi.java.j6.sample.services;

import ir.edu.farhadi.java.j6.sample.models.Diskette;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class DisketteService {

    public void calculateSumPriceBetweenTwoDiskette(Diskette disketteOne, Diskette disketteTwo) {
        long result = disketteOne.getPrice() + disketteTwo.getPrice();
        System.out.println("The Sum is :" + result);
    }
}
