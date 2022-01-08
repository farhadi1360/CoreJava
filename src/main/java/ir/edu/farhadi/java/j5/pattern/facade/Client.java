package ir.edu.farhadi.java.j5.pattern.facade;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Client {

    public static void main(String[] args) {
        /*
           sample with conversational State
         */
        CustomerFacade customerFacade;
        customerFacade = new CustomerFacade();
        customerFacade.setFname("Mostafa");
        customerFacade.setLname("Farhadi");
        customerFacade.setAddress("Tehran");
        customerFacade.setCardExpDate("1400/02/02");
        customerFacade.setCardType("CreditCard");
        customerFacade.setCity("Tehran");
        customerFacade.setState("Tehran");
        customerFacade.saveCustomerData();
    }
}
