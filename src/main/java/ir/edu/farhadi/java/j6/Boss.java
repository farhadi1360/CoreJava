package ir.edu.farhadi.java.j6;

import ir.edu.farhadi.java.j3.Book;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Boss extends Personnel {
    protected int salary;
    private int range;
    public Boss(){
        System.out.println("Constructor Of Boss was called   ");
    }
    public Boss(int range){
        this.range = range;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary!=0 && salary>0){
            this.salary = salary;
        }else {
            System.out.println("your input salary is not set ");
        }

    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    protected void doSomeThings() {
        System.out.println("Call doSomeThings");
    }

    private void test1(){
        System.out.println(" This is Test 1");
    }
    public void test2(){
        System.out.println(" This is Test 2");
    }

    /**
     * You can Not Override for static method
     */
    public static void test3(){
        System.out.println(" This is Test 3");
    }


}
