package ir.edu.farhadi.java.test.dao;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class StudentDAOInterface implements DatabaseDAOInterface {


    public void save() {
        System.out.println("Save Student");
            merge();
        mergeAndCheck();
    }

     private void merge() {

    }
    private void mergeAndCheck() {

    }
    public void update() {
        System.out.println("Update Student");
    }
    public void findByName(String name) {
        System.out.println("Find By Name");
    }
}
