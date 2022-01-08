package ir.edu.farhadi.java.j5.pattern.facade;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class CustomerFacadeWithOutConversationalState {

    private CustomerFacadeWithOutConversationalState() {
    }

    public static boolean saveCustomerData(String fname, String lname, String address, String city, String state, String cardType, String cardNumber, String cardExpDate) {
        Address objAddress;
        Account objAccount;
        CreditCard objCreditCard;
        objAccount = new Account(fname, lname);
        objAccount.save();
        System.out.println("Account was saved");
        objAddress = new Address(address, city, state);
        objAddress.save();
        System.out.println("Address was saved");
        objCreditCard = new CreditCard(cardType, cardNumber,
                cardExpDate);
        objCreditCard.save();
        System.out.println("CreditCard was saved");
        return true;

    }

}
