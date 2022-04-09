package ir.edu.farhadi.java.j16;

import java.util.*;

/**
 * Java Collections Framework (JCF)
 * The Java platform includes a collections framework. A collection is an object that represents a group of objects
 * <p>
 * all collection sre divided to two main parts
 * Ordered (seq,index) And  Sorted
 * <p>
 * Sorted is  : all family of Set  like  HashMap,TreeSet,...
 * Ordered id : all family of List like ArrayList , LinkedList
 */
public class JCF {

    public static void main(String[] args) {
//        testArrayList();
//        testCollection();
//        testQueue();
        testMap();
    }

    private static void testArrayList() {
        ArrayList firstArrayList = new ArrayList();
        System.out.println(firstArrayList.size()); // out is  0
        ArrayList secondArrayList = new ArrayList(20);
        System.out.println(secondArrayList.size()); //  out 0

        Student student = new Student("Mostafa", "Farhadi", 100);

        for (int i = 0; i <= 10; i++) {
            secondArrayList.add(student);
        }
        System.out.println(secondArrayList.size()); // out is 11

        secondArrayList.remove(student);

        System.out.println(secondArrayList.size()); // out is 10

        secondArrayList.trimToSize();
        System.out.println(secondArrayList.size()); // out is 10

        // we can remove by index which has a better performance
        Student studentRemoved = (Student) secondArrayList.remove(0);
        System.out.println(studentRemoved.getCode() + "");
        System.out.println(secondArrayList.size()); // out is 9
    }

    /*
       we can use Collection Interface for result of methods
     */
    private static void testCollection() {
        getStudents();
    }

    private static Collection<Student> getStudents() {
        //  ArrayList Vs LinkedList
        List<Student> students = new ArrayList<>();
        List<Student> studentList = new LinkedList<>();
        Set<Student> studentSet = new HashSet<>();
//        return students;
        return getStudents();
    }

    private static void testQueue() {
        Queue<String> q = new LinkedList();

        q.offer("Mostafa");
        q.offer("Javad");
        q.offer("Mohamad");

        String first = q.poll();//  poll -->  read first element and remove it
        System.out.println(first);

        String second = q.poll();
        System.out.println(second);

        String s = q.peek();//  peek -->  read head element but does not  remove it
        System.out.println(s);

    }

    private static void testMap() {
        Map<String, Student> map = new HashMap();
        map.put("User1", new Student("Mostafa", "Farhadi", 100));
        map.put("User2", new Student("Javad", "Karimi", 200));
        map.put("User3", new Student("Mohamad", "HajiEsmaily", 300));

        Student s1 = map.get("User1");
        System.out.println( s1.getName() + " : " + s1.getCode() );

        System.out.println("***********All Users************");
        Collection<Student> allUsers = map.values();
        for (Student usr : allUsers)
            System.out.println(usr.getName() );

        System.out.println("***********A************");
        Set<Map.Entry<String,Student>> newSet = map.entrySet();
        for (Map.Entry<String,Student> user : newSet) {
            System.out.println( user.getKey() + " " + user.getValue().getName() );
        }

    }

}
