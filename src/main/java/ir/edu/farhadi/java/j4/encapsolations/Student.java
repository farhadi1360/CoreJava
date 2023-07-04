package ir.edu.farhadi.java.j4.encapsolations;

/**
 * this class is not using an Encapsulation
 */
public class Student {
    int code;
    String name;
    int age;
    long avg;

    void takeClass() {

        int code = 50;
        System.out.println(name.concat(" with " + age + " Age ".concat(" Can Take a Class")));
    }

    void reject() {
        System.out.println(name.concat(" with " + age + " Age".concat(" must be Reject")));
    }

}
