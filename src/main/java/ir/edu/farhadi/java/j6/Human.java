package ir.edu.farhadi.java.j6;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Human {
    private String name;
    private String family;

    public Human(){
        System.out.println("Constructor Of Human was called");
    }
    public Human(String name, String family) {
        this.name = name;
        this.family = family;
        System.out.println("Constructor Of Human was called with these parameters  ".concat(name).concat("  ").concat(family));
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


    public void
    save(){
        System.out.println("Save Method is master method that put in superclass");
    }
}
