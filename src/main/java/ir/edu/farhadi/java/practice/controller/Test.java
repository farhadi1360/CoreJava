package ir.edu.farhadi.java.practice.controller;

import ir.edu.farhadi.java.practice.models.*;
import ir.edu.farhadi.java.practice.services.UserService;
import ir.edu.farhadi.java.practice.services.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
        User mostafa = new User();
        mostafa.setName("Mostafa");
        mostafa.setFamily("Farhadi");
        mostafa.setWallet(new Wallet(10000));
        Penalty redLight = new RedLight(1400);


        User javad = new User();
        javad.setName("Javad");
        javad.setFamily("Karimi");
        javad.setWallet(new Wallet(9000));
        Penalty speedLimit = new SpeedLimit(50000);

        UserService userService = new UserServiceImpl();

        userService.deposit(mostafa);
        userService.deposit(javad);

        userService.charge(mostafa,redLight);
        userService.charge(javad,speedLimit);

    }
}
