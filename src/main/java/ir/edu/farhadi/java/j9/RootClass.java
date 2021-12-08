package ir.edu.farhadi.java.j9;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class RootClass extends Object {


    public static void testMethod(Object obj) {
        System.out.println(obj.getClass().getName());
    }

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Parent(1);
        Object obj3 = "Mostafa";
        Object obj4 = new int[2];
        Object obj5 = 3l;
        Object obj6 = 3;
        Object obj7 = new int [3];
        Object obj8 = new double[5];
        testMethod(obj8);
    }
    /*
         what is polymorphism ?
           The fact that an object variable (such as the variable e) can refer to multiple actual
           types is called polymorphism like this
           this is a Coercion Polymorphism
              Parent parent = new Child(1);  --- in another view we can see this is upcasting


            Before Inheritance method we have to use Old Polymorphism:  (ad-hoc)
            but After  Inheritance we can see New Polymorphism:  (Coercion, sub-typing, parametric)

            first: ad-hoc Polymorphism     (Method Overloading)

            second: sub-typing Polymorphism (Inclusion Polymorphism)

            Third: parametric Polymorphism (Universal polymorphism)


     */

}
