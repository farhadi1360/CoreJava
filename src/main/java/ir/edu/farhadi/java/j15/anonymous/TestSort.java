package ir.edu.farhadi.java.j15.anonymous;

import java.util.Arrays;
import java.util.Comparator;

public class TestSort {

    public static void main(String[] args) {

        Student[] students = {
                new Student("Ali", "Darabi", 160),
                new Student("Mustafa", "Farhadi", 100),
                new Student("Reza", "javadi", 150)

        };
        oldWay(students);
        for (Student student : students) {
            System.out.println(student.getName());
        }

    }

    public static void oldWay(Student[] students) {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });


    }
}
