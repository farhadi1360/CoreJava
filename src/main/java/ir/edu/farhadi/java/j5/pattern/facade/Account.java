package ir.edu.farhadi.java.j5.pattern.facade;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Account {
    String name;
    String family;

    public Account(String name, String family) {
        this.name = name;
        this.family = family;
    }
    public boolean isValid(){
        return true;
    }
    public void save() {
        System.out.println("Account was saved");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
