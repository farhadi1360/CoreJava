package ir.edu.farhadi.java.j3;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class TestBook {

    public static void main(String[] args) {
        Library library = new Library(1400, new Book(1200));

        System.out.println(library.getCode());
        System.out.println(library.getBook().getPrice());

        System.out.println(library.getBook().getPrice());
    }



}
