package ir.edu.farhadi.java.test;

import ir.edu.farhadi.java.j15.anonymous.Student;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListFiltering {
    public static void main(String[] args) {
//        LocalDate start = LocalDate.now();
//        LocalDate end = LocalDate.now().plusMonths(1).with(TemporalAdjusters.lastDayOfMonth());
//
//        List<LocalDate> dates = Stream.iterate(start, date -> date.plusDays(1))
//                .limit(ChronoUnit.DAYS.between(start, end))
//                .collect(Collectors.toList());
//
//// Get Min or Max Date
//        LocalDate maxDate = dates.stream()
//                .max(Comparator.comparing(LocalDate::toEpochDay))
//                .get();
//        LocalDate minDate = dates.stream()
//                .min(Comparator.comparing(LocalDate::toEpochDay))
//                .get();

        step4();
    }


    static void step1() {
        List<Student> studentList = getStudents();
        studentList.stream().filter(student -> student.getName().equals("Mustafa"))
                .map(Student::getName)
                .forEach(System.out::println);
    }

    static void step2() {
        List<Student> studentList = getStudents();
        String name = studentList.stream().filter(student -> "Mustafa".equals(student.getName()))
                .map(Student::getName).findAny().orElse("");
        System.out.println(name);
    }

    static void step3() {
        List<Student> studentList = getStudents();
        Optional<Student> micCode = studentList.stream().min(Comparator.comparing(Student::getCode));
        Optional<Student> moxCode = studentList.stream().max(Comparator.comparing(Student::getCode));
        micCode.ifPresent(min -> System.out.println(min));
        moxCode.ifPresent(mox -> System.out.println(mox));
    }

    static void step4() {
        List<Student> studentList = getStudents();
        Optional<Integer> totalValuse = studentList.stream()
                .map(std -> std.getCode())
                .filter(code -> code > 40)
                .reduce((code1, code2) -> code1 + code2);
        totalValuse.ifPresent(System.out::println);
    }

    private static List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mustafa", "Farhadi", 10));
        studentList.add(new Student("Shervin", "Farhadi", 20));
        studentList.add(new Student("Reza", "Javadi", 30));
        studentList.add(new Student("Javad", "Karimi", 40));
        studentList.add(new Student("Meysam", "Aminzadeh", 50));
        studentList.add(new Student("Mustafa", "Karimi", 60));
        studentList.add(new Student("Rasoul", "Javadi", 70));
        studentList.add(new Student("Monsour", "Farojki", 80));
        studentList.add(new Student("Mustafa", "Karimi", 90));
        studentList.add(new Student("Mustafa", "Farojki", 100));

        return studentList;
    }

}
