package ir.edu.farhadi.java.j7;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 * sample for method overriding or Dynamic Method Dispatch
 */
public class SubClass extends SuperClass {



    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.defaultCalculate();
    }
    /**
     * we can not change level of access modifier
     * i means if we have protected or public access modifier for method we have to
     * set definitely access modifier or stranger
     * for instance in this method i can not set private or default(package) access modifier
     */
    public void defaultCalculate() {
        System.out.println(" This is defaultCalculate on SubClass");
    }

    /**
     * after java 5 we can change type of return type in overriding
     * @param a
     * @param b
     * @return the child of parent type
     */

    public Double getSum(int a , int b) {
        return null;
    }

    /**
     * after java5 we can use a @Override for Overriding
     * @Override is optional
     */
     @Override
    protected void doIt(){
        System.out.println(" This is doIt method on SubClass");
    }

}
