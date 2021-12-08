package ir.edu.farhadi.java.j5.pattern.facade;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class CustomerFacade {
    private String address;
    private String city;
    private String state;
    private String cardType;
    private String cardNumber;
    private String cardExpDate;
    private String fname;
    private String lname;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardExpDate(String cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }


    public boolean saveCustomerData() {
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
