package ir.edu.farhadi.java.j11.contract;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Execute {

    void call(Contract contract) {
        contract.readText();
        contract.parseText();
        contract.binding();
        contract.execute();
    }
}
