package ir.edu.farhadi.java.j15.methosrefrencs.simple;


@FunctionalInterface
interface Appender<T> {
    T append(T mem1, T mem2);
}

public class Test2 {


    public static void main(String[] args) {
//       step1();
//        step2();
        step3();
    }

    public static void step1() {
        Appender<String> res1 = (str1, str2) -> str1.concat(str2);
        String result = res1.append("Mostafa  ", " Farhadi !!!!! in Lambda Mode");
        System.out.println(result);
    }

    public static void step2() {
        Appender<String> res1 = Test2::concatString;
        String result = res1.append("Mostafa", "Farhadi !!!!! in method reference Mode");
        System.out.println(result);
    }

    public static String concatString(String str1, String str2) {
        return str1.concat(str2);
    }

    public static void step3() {
        Test2 test2 = new Test2();
        Appender<Integer> res1 = test2::adder;
        Integer result = res1.append(15, 10);
        System.out.println(result);

    }

    public Integer adder(Integer num1, Integer num2) {
        return num1 + num2;
    }

}
