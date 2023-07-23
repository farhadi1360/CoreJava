package ir.edu.farhadi.java.j15.anonymous;

import java.util.Arrays;
import java.util.Comparator;

public class SampleAnonymousAsReference {



    public static void main(String[] args) {
        Student[] students = {
                new Student("Ali", "Darabi", 160),
                new Student("Mustafa", "Farhadi", 100),
                new Student("Reza", "javadi", 150)

        };
        // we can use this way as  reference
        Comparator<Student> reference = new Comparator<Student>() { // this is  Anonymous class
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getCode(), s2.getCode());
            }
        };
        AnonymousAsReference(students, reference);
        for (Student student : students) {
            System.out.println(student.getName().concat("  ").concat(Integer.toString(student.getCode())));
        }
    }

    private static void AnonymousAsReference(Student[] students,Comparator<Student> reference ) {
        Arrays.sort(students, reference); // you can use the reversed method for descending
    }

}
