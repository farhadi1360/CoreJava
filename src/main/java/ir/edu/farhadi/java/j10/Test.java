package ir.edu.farhadi.java.j10;

import ir.edu.farhadi.java.j6.Boss;
import ir.edu.farhadi.java.j6.Human;
import ir.edu.farhadi.java.j6.Personnel;

import java.util.ArrayList;
import java.util.Objects;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Test {
    public static void main(String[] args) {

//        simpleGenericType();
//        useBoundedType();
//        testArrayListSteepOne();
//        testArrayListStepTwo();
        testUseGenericInArrayList();
    }

    private static void simpleGenericType() {
        GenericClass<String> stringClass = new GenericClass<>();
        stringClass.setT("Mostafa"); // String -> Mostafa ---->T
        GenericClass<Integer> integerClass = new GenericClass<>();
        integerClass.setT(20);       // Integer -> 20 ---->T
        System.out.println(stringClass.getT());
        System.out.println(integerClass.getT());
    }
    private static void useJavaDataStructure() {
        ArrayList<Personnel> arrayList = new ArrayList();
        /**
         * check some methods
         */


    }
    private static void useBoundedType() {
        GenericBounded<Personnel> genericBounded = new GenericBounded<Personnel>(); // before java 1.7

        GenericBounded<Personnel> genericBoundedNew = new GenericBounded(); // After java 1.7
    }

    /*
        use WildCard by this format <?>
        it means anytype and  you can not refer to type of <?> you only can pass and dont use or refer to it
        for example we can not use  GenericBounded<?> genericBounded;
        public ArrayList(Collection<? extends E> c) {
     */
    private static void testArrayListSteepOne() {
        ArrayList list = new ArrayList();
        list.add("Mostafa");
        list.add(new Human());
        list.add(10);
        Human human = (Human) list.get(0); //ClassCastException
    }
    private static void testArrayListStepTwo() {
        ArrayList list = new ArrayList();
        list.add("Mostafa");
        list.add(new Human());
        list.add(10);
        if (list.get(0) instanceof Human){
            Human human = (Human) list.get(0);
        }
    }

    private static void testUseGenericInArrayList() {
        ArrayList<Human> list = new ArrayList<>();
//        list.add("Mostafa");
        list.add(new Human());
//        list.add(10);
        Human human = list.get(0); // no need to instanceof and down casting
    }


}
