package ir.edu.farhadi.java.j15.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        test1();

    }

    private static void test1() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(p -> System.out.println(p));
    }

    private static void test2() {
        List<String> userNames = Arrays.asList("fr1", "fr2", "usr1", "usr2", "fr3", "usr3");
        userNames.stream()
                .filter(f -> f.startsWith("f"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }

    private static void test3() {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList =
                stream.filter(i -> i%2 == 0)
                .collect(Collectors.toList());
        System.out.print(evenNumbersList);
    }

}
