package ir.edu.farhadi.java.j12.designpatern.anonymous;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Test {

    public static void main(String[] args) {
        Human student = new Human() {
            @Override
            public void eat() {
               /* {} we can use init block
                  instead of constructor
                */
                {
                    System.out.println("washing hands");
                }
                System.out.println("student is eating now");
            }
        };
        Human personnel = new Human() {
            @Override
            public void eat() {
                System.out.println("personnel is eating now");
            }
        };


        student.eat();

        personnel.eat();
    }
}
