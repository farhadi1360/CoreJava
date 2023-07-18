package ir.edu.farhadi.java.j8.abstraction.templatemethods;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 * in this class im going to use a template method design pattern for create insurance disket
 */
public abstract class AbstractTemplateDisketteClass {

    // this is template method
    final void calculateInsurance() {
        logBeforeCalculate();
        calculate();
        logAfterCalculate();
    }

    void logBeforeCalculate() {
        System.out.println("Before Insurance calculate ");
    }

    abstract void calculate();

    void logAfterCalculate() {
        System.out.println("After Insurance calculate ");
    }
}
