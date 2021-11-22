package ir.edu.farhadi.java.j7;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Overloading {

    /**
     * when we use Overloading in Java we should be understand of all rule for detective method which has seems names
     * as you know we have 3 steps for that
     * step 1 : selected methods without boxing or unboxing conversion or without  arity variable (...)
     * step 2 : selected method  with  boxing or unboxing but without  arity variable (...)
     * step 3 : selected method  with  arity variable (...)
     *
     * @param args
     */


    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.calculateSalary(5, 5);
    }

    int calculateSalary(int x, int y) {
        System.out.println("Executed calculateSalary by considering  primitives type i mean int ");
        return x;
    }

    long calculateSalary(long x, long y, long z) {
        System.out.println("Executed calculateSalary by considering  primitives type i mean long ");
        return x;
    }

    long calculateSalary(long x, long y) {
        System.out.println("Executed calculateSalary by considering  primitives type i mean long ");
        return x;
    }

    Long calculateSalary(Long a, Long b) {
        System.out.println("Executed calculateSalary by considering  reference type i mean Long Object ");
        return Long.valueOf(0);
    }

    long calculateSalary(long... a) {
        System.out.println("Executed calculateSalary by considering  arity type ");
        return 0;
    }
    /*
        this is sanple for ambiguity
     */
//    double calculateSalary(int a, int b) {
//        System.out.println("Executed calculateSalary by considering  primitives type i mean int ");
//        return 0;
//    }


}
