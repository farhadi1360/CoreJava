package ir.edu.farhadi.java.j15.lombda.sort;

import java.util.Arrays;
import java.util.Comparator;

public class SampleAnonymousAsField {
    // Field
    Comparator<Student> field = new Comparator<Student>(){
        public int compare(Student s1, Student s2) {
            return Integer.compare( s1.getCode(), s2.getCode() );
        }
    };

    public static void main(String[] args) {
        SampleAnonymousAsField sampleAnonymousAsField = new SampleAnonymousAsField();
        sampleAnonymousAsField.sample();

    }

    private  void sample() {
        Student[] students = {
                new Student("Ali", "Darabi", 160),
                new Student("Mustafa", "Farhadi", 100),
                new Student("Reza", "javadi", 150)

        };
        Arrays.sort(students, this.field);
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

}
