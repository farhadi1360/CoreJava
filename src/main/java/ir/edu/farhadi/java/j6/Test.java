package ir.edu.farhadi.java.j6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Test {
    public static void main(String[] args) {

//        step1();
        //  step2();
//        step4();
        step6();
    }


    private static void step1() {
        Boss boss = new Boss();
        boss.setSalary(1000);
        boss.setPersonnelCode("1000");
        boss.setName("Mostafa");
        boss.setFamily("Farhadi");
        boss.save();

    }

    /*
         we can create Actual Object in inheritance mechanism but
         the object in power related to our vision
     */
    private static void step2() {

        Boss boss = new Boss();
        Personnel personnel = boss;
        Human human = boss;

        Human bigHuman = new Human();
        Boss boss1 = (Boss) bigHuman;
         /*
           we can create boss view
          */
        boss.save();
        boss.doSomeThings();
        boss.checkPersonnelCode();
         /*
           we can create personnel view
          */
        personnel.checkPersonnelCode();
        personnel.save();

         /*
           we can create human view
          */
        human.save();


    }

    /**
     * check for access to static method in inheritance
     */
    private static void step3() {
        Boss boss = new Boss();

        /*
          i can access to static method by reference
         */
        boss.calculateAgeOfPerson();
        /*
         although i can access to static method by owner class
         */
        Personnel.calculateAgeOfPerson();
        /*
          plus i can access to static method by subclass
         */
        Boss.calculateAgeOfPerson();
    }

    private static void step4() {
        Boss boss = new Boss();
        Personnel personnel = boss;
        Human human = boss;


        human.setName("Mostafa");
        boss.setRange(10);
        logAllBossRanges(personnel);
    }

    //**********  Reference Type Casting
    static void logAllBossRanges(Object obj) {
        Boss boss = (Boss) obj;
        Personnel personnel = (Personnel) obj;
        Human human = (Human) obj;

        boss.setRange(10);
        System.out.println(boss.getRange());
    }

    private static void step6() {
        Personnel personnel = new Personnel();
        personnel.setPersonnelCode("1500");
        classCastException(personnel);
//        useInstanceof(personnel);
    }

    static void classCastException(Object obj) {
        String personnel = (String) obj;
        System.out.println(personnel.toString());
    }
    static void useInstanceof(Object obj) {
        if( obj instanceof  Personnel){
            Personnel personnel = (Personnel) obj;
            System.out.println(personnel.toString());
        }
    }


}
