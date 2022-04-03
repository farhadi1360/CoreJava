package ir.edu.farhadi.java.j15.lombda.sort;

import ir.edu.farhadi.java.j15.anonymous.Student;

import java.util.Arrays;

public class TestLambda {

    public static void main(String[] args) {
        Student[] students = {
                new Student("Ali", "Darabi", 160),
                new Student("Mustafa", "Farhadi", 100),
                new Student("Reza", "javadi", 150)

        };

        newWay(students);
        newWay2(students);
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public static void newWay(ir.edu.farhadi.java.j15.anonymous.Student[] students) {
        Arrays.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
    }

    public static void newWay2(Student[] students) {
        Arrays.sort(students, (s1, s2) -> s1.getCode() - s2.getCode());

    }

}
