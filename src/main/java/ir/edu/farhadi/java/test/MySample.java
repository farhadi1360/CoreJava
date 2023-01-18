package ir.edu.farhadi.java.test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MySample {

    public static void main(String[] args) {

        String word = "AABBB";
        Map<String, Long> charCount = word.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        charCount.forEach((K,V)-> System.out.println(K +"  Count is " + V));

    }
}
