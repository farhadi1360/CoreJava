package ir.edu.farhadi.java.j12.designpatern.strategy;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class ESB {
    /*
       in Strategy pattern this field called Context Object Or Strategy Object
     */
    private ServiceBus serviceBus;

    public ESB(ServiceBus serviceBus) {
        this.serviceBus = serviceBus;
    }

    public void readAllDataByStrategy() {
        serviceBus.readDate();
    }
}
