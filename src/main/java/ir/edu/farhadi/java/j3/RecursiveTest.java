package ir.edu.farhadi.java.j3;

public class RecursiveTest {

    public static void main(String[] args) {

        rec(1);

    }

    static void rec(int i) {

        System.out.println(i);
        rec(++i);
    }

}
