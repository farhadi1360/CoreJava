package ir.edu.farhadi.java.j11.polimorphism.simple;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class StudentRepository implements Repository{
    @Override
    public void save() {
        System.out.println("Student was saved");
    }
}
