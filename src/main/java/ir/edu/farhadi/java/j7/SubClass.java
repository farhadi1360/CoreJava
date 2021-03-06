package ir.edu.farhadi.java.j7;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 * sample for method overriding or Dynamic Method Dispatch
 */
public class SubClass extends SuperClass {


    public static void main(String[] args) {
        SubClass value = new SubClass();
//        subClass.defaultCalculate();
        value.staticLog();
//        value.testForAccessToParentMethod();
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
     *
     * @param a
     * @param b
     * @return the child of parent type
     */

    public Double getSum(int a, int b) {
        return null;
    }

    /**
     * after java5 we can use a @Override for Overriding
     *
     * @Override is optional
     */
    @Override
    protected void doIt() {
        System.out.println(" This is doIt method on SubClass");
    }

    /**
     * we can use super keyword for access to parent methods or fields
     * the important note is that super does not refer to current object like 'this' keyword
     * and we use 'super' just in seem names of methods or fields between parent and child objects
     * as you know with super we we can reference from child to parent No all of the parents
     */
    public void testForAccessToParentMethod() {
        System.out.println("Before Call Parent Method");
        super.doIt();
        System.out.println("After Call Parent Method");
    }

    /**
     * we can not never  override a final method in java
     * because that method just defined once by parent
     * to mack it clear i should say in java we have 3 keywords which if we want to use
     * them actually we prevent Override Mechanism
     * 1 - final 2- static 3- private
     *
     */
//    protected final void checkSecurity() {
//        System.out.println("Call checkSecurity Method on SubClass");
//    }

    public static void staticLog(){
        System.out.println(" This is log method on SubClass");
    }
    public  void nonStaticLog(){
        System.out.println(" This is log2 method on SubClass");
    }

}
