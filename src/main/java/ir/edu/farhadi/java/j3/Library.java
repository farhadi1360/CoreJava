package ir.edu.farhadi.java.j3;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Library {
    private final int code;
    private final Book book;

    public Library(int code, Book book) {
        this.code = code;
        this.book = book;
    }

    public int getCode() {
        return code;
    }

    public Book getBook() {
        return book;
    }
}
