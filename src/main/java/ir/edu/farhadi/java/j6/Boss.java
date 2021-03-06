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
    public Boss(int salary) {
        super("007");
        this.salary = salary;
        System.out.println("Constructor Of Boss was called with these parameters  "+salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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



}
