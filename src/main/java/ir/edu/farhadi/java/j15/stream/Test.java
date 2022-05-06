package ir.edu.farhadi.java.j15.stream;

import ir.edu.farhadi.java.j15.anonymous.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();

    }

    private static void test1() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(System.out::println);
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

        for (int i = 1; i < 10; i++) {
            list.add(i);
        }

        Stream<Integer> stream = list.stream();


        List<Integer> evenNumbersList =
                stream.filter(i -> i % 2 == 0)
                        .collect(Collectors.toList());
        System.out.print(evenNumbersList);
    }

    private static void test4() {
        Stream.of(1.5, 2.5, 3.5)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "user" + i)
                .forEach(System.out::println);
    }

    private static void test5() {
        Student[] students = {
                new Student("Ali", "Darabi", 160),
                new Student("Mustafa", "Farhadi", 100),
                new Student("Mohammad", "Reaei", 200),
                new Student("Reza", "javadi", 150)

        };

        List<Student> studentList = Arrays.asList(students.clone());

        List<Student> filteredStudent = studentList.stream()
                .filter(s -> s.getName().startsWith("M"))
                .collect(Collectors.toList());

        System.out.println("****************Before Filtering **************");
        studentList.forEach(System.out::println);
        System.out.println("****************After Filtering **************");
        filteredStudent.forEach(System.out::println);
    }
    private static void testOptional(){
        Optional<Student> student = getStudent();
    }

    public static Optional<Student> getStudent(){
        Student students = new Student("Mustafa", "Farhadi", 100);
        return Optional.of(students);
    }

}
