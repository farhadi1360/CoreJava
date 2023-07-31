package ir.edu.farhadi.java.j15.lombda.fanap.basic;

public class Test {

    public static void main(String[] args) {
        Appender<String> appender = (s1, s2) -> s1.concat(s2);
        String result = appender.append("My Name is  ", " Mostafa");

        Appender<Integer> appender1 = (n1, n2) -> n1 + n2;
        Integer resultNumber = appender1.append(10, 50);

        System.out.println(result);
        System.out.println("resultNumber is : ".concat(Integer.toString(resultNumber)));

    }
}
