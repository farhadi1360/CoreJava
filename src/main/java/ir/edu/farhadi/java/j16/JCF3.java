package ir.edu.farhadi.java.j16;

import java.util.*;


public class JCF3 {

    public static void main(String[] args) {
//        synchronizedList();
//        synchronizedMap();
//        wildCardExceptionInGenericMode();

    }


    static private void synchronizedList() {
        Student student = new Student("Mostafa", "Farhadi", 100);
        Student student2 = new Student("Javad", "Karimi", 200);
        Student student3 = new Student("Mostafa", "Farhadi", 300);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);

        Collection collection = Collections.synchronizedList(studentList);
        calculateSumCodeByCollection(collection);
    }

    static private void synchronizedMap() {
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("User1", new Student("Mostafa", "Farhadi", 100));
        studentMap.put("User2", new Student("Javad", "Karimi", 200));
        studentMap.put("User3", new Student("Mohamad", "HajiEsmaily", 300));

        Map<String, Student> stringStudentMap = Collections.synchronizedMap(studentMap);


        calculateSumCodeByCollection(stringStudentMap.values());
    }

    static void calculateSumCodeByCollection(Collection<Student> collection) {
        int sum = 0;
        Iterator<Student> iter = collection.iterator();
        while (iter.hasNext()) {
            sum += iter.next().getCode();
        }

        System.out.println("The Sum Code In  Collection with Generic Mode Is : " + sum);
    }

    static void wildCardExceptionInGenericMode() {
        List<?> list = new ArrayList<>(Arrays.asList(new Student("Mostafa", "Farhadi", 100),
                new Student("Javad", "Karimi", 200),
                new Student("Mohamad", "HajiEsmaily", 300)
        ));

        list.remove(0);
        list.stream().forEach(System.out::println);
//        list.add(new Student("Mostafa", "Farhadi", 100)); // compile error
    }
}
