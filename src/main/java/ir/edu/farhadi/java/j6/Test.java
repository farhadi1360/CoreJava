package ir.edu.farhadi.java.j6;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Test {
    public static void main(String[] args) {

        step1();
        step2();
    }

    private static void step1() {
        Boss boss = new Boss(1000);
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
}
