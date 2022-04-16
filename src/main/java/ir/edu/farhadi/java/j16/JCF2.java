package ir.edu.farhadi.java.j16;

import java.util.*;

public class JCF2 {

    public static void main(String[] args) {
        Student student = new Student("Mostafa", "Farhadi", 100);
        Student student2 = new Student("Javad", "Karimi", 200);
        Student student3 = new Student("Mostafa", "Farhadi", 300);

        Student[] students = {student, student2, student3};

        calculateSumCodeByArray(students);


        ArrayList studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);

        calculateSumCodeByArrayList(studentList);


        calculateSumCodeByGenericArrayList(studentList);


        calculateSumCodeByList(studentList);


        calculateSumCodeByCollection(studentList);

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("User1", new Student("Mostafa", "Farhadi", 100));
        studentMap.put("User2", new Student("Javad", "Karimi", 200));
        studentMap.put("User3", new Student("Mohamad", "HajiEsmaily", 300));

        calculateSumCodeByCollection(studentMap.values());
    }

    static void calculateSumCodeByArray(Student[] students) {
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getCode();
        }
        System.out.println("The Sum Code In Array Mode Is : " + sum);
    }

    static void calculateSumCodeByArrayList(ArrayList arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += ((Student) arrayList.get(i)).getCode();
        }
        System.out.println("The Sum Code In  ArrayList Mode Is : " + sum);
    }

    static void calculateSumCodeByGenericArrayList(ArrayList<Student> studentArrayList) {
        int sum = 0;
        for (Student student : studentArrayList) {
            sum += student.getCode();
        }

        System.out.println("The Sum Code In Generic Array Mode Is : " + sum);

    }


    static void calculateSumCodeByList(List<Student> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getCode();
        }

        System.out.println("The Sum Code In  List Mode Is : " + sum);
        ListIterator<Student> listIterator = list.listIterator();
        listIterator.next();
        listIterator.previous();
    }

    static void calculateSumCodeByCollection(Collection<Student> collection) {
        int sum = 0;

        Iterator it = collection.iterator();

        while (it.hasNext()) {
            Student student = (Student) it.next();
            sum += student.getCode();
        }
        System.out.println("The Sum Code In  Collection No Generic Mode Is : " + sum);
        Iterator<Student> iter = collection.iterator();
        while (iter.hasNext()) {
            sum += iter.next().getCode();
        }

        System.out.println("The Sum Code In  Collection with Generic Mode Is : " + sum);
    }

}
