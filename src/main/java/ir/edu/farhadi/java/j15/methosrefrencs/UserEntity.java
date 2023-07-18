package ir.edu.farhadi.java.j15.methosrefrencs;

public class UserEntity {

    String name;
    String family;

    public UserEntity(String name, String family) {
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
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }
}
