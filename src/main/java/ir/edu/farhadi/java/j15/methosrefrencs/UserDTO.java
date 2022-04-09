package ir.edu.farhadi.java.j15.methosrefrencs;

public class UserDTO {

    String name;
    String family;
    public UserDTO(String name, String family) {
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
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }
}
