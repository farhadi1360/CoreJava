package ir.edu.farhadi.java.j5;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class TestSingleObject {
    public static void main(String[] args) {
        SingleObject obj1 = SingleObject.getOnlyOneObject();
        SingleObject obj2 = SingleObject.getOnlyOneObject();
        SingleObject obj3 = SingleObject.getOnlyOneObject();
        if (obj1==obj2 && obj3==obj1){
            System.out.println("All Of The objects are Equals");
        }
    }
}
