package ir.edu.farhadi.java.j5.pattern.facade;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Client2 {

    public static void main(String[] args) {
           /*
           sample with No conversational State
         */
        CustomerFacadeWithOutConversationalState.saveCustomerData("Mostafa", "Farhadi", "Fatemi", "Tehran", "Tehran", "Debite", "58921010165454545454", "1399");
    }
}
