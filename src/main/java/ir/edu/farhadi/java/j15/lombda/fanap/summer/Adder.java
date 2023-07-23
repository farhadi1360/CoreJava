package ir.edu.farhadi.java.j15.lombda.fanap.summer;

public class Adder {

    public static void main(String[] args) {

        Calculation calculation = (a, b) -> a + b;
        printResult(calculation);

    }

    public static void printResult(Calculation calculation) {
        int result = calculation.calculate(5, 10);
        System.out.println(result);
    }




}
