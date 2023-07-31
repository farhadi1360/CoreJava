package ir.edu.farhadi.java.j15.lombda.fanap.summer;

public class Adder {

    public static void main(String[] args) {

        Calculation adder = new Calculation() {
            @Override
            public int calculate(int a, int b) {
                return a+b;
            }
        };

        Calculation multi = new Calculation() {
            @Override
            public int calculate(int a, int b) {
                return a*b;
            }
        };


//        Calculation adder = (a, b) -> a + b;
//        Calculation multipile = (a, b) -> a * b;
//        printResult(adder);
//        printResult(multipile);

    }

    public static void printResult(Calculation calculation) {
        int result = calculation.calculate(5, 10);
        System.out.println(result);
    }




}
