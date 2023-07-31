package ir.edu.farhadi.java.j15.functionalinter.basic;

public class PersonEntity {
    private String firstName;
    private String laseName;

    public PersonEntity(String firstName, String laseName) {
        this.firstName = firstName;
        this.laseName = laseName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLaseName() {
        return laseName;
    }

    public void setLaseName(String laseName) {
        this.laseName = laseName;
    }
}
