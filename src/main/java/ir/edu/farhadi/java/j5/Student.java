package ir.edu.farhadi.java.j5;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Student implements Cloneable  {
    private String name;
    private String family;

    public Student(String name, String family) {
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

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
