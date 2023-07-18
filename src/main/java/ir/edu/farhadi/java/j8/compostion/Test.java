package ir.edu.farhadi.java.j8.compostion;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Test {
    public static void main(String[] args) {
        ServiceBus serviceBus = new ServiceBus();
        serviceBus.getDatabaseConnector();
        serviceBus.getFTPConnector();
        serviceBus.getHttpConnector();
        serviceBus.getTCPConnector();
      /**************Composite State *****************/
        System.out.println(" /**************Composite State *****************/");
        serviceBus.getFullConnection();
    }
}
