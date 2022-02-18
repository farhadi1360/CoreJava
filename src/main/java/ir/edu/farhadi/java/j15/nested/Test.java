package ir.edu.farhadi.java.j15.nested;

public class Test {
    public static void main(String[] args) {
        Exception exception = new Exception.MessageBuilder().withCode(1000)
                .withMessage("Run time Error")
                .build();
        System.out.println(exception);
    }
}
