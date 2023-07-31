package ir.edu.farhadi.java.j15.functionalinter.basic;

public class PersonModel {
    private String name;
    private String family;

    public PersonModel(String name, String family) {
        this.name = name;
        this.family = family;
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

    @Override
    public String toString() {
        return "PersonModel{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }
}
