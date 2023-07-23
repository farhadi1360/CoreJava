package ir.edu.farhadi.java.j15.anonymous;

import java.util.Arrays;
import java.util.Comparator;

public class TestSort {

    public static void main(String[] args) {

        Student[] students = {

                new Student("Mustafa", "Farhadi", 100),
                new Student("Reza", "javadi", 150),
                new Student("Ali", "Darabi", 160)

        };
        oldWay(students);

        for (Student student : students) {
            System.out.println(student.getName().concat("  ").concat(Integer.toString(student.getCode())));
        }

    }

    public static void oldWay(Student[] students) {

//        Arrays.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });


    }


}
