package ir.edu.farhadi.java.j1;

import com.googlecode.gwt.crypto.util.Str;

public class TestReferences {




    public static void main(String[] args) {

//        test1();
//          test2();
//        test3();
    }



    private static void test1(){
        Integer num1 = new Integer(5);
        int n = num1.intValue();
        // after java 5

        //Autoboxing
        Integer num2 = 5;
        //unbox
        int n2 = num2;
        if (num1 == num2) {
            System.out.println("Afarin Bache Khob ");
        }else{
            System.out.println("Omran");
        }

        if (num1.equals(num2)) {

            System.out.println("Afarin Bache Khob ");
        } else {
            System.out.println("Omran");
        }
    }

    /**
     *  IntegerCache
     *  Cache to support the object identity semantics of autoboxing for values between
     *  -128 and 127 (inclusive)
     */
    private static void test2(){
        Integer num1=1500000;
        Integer num2=1500000;
        if (num1 == num2) {
            System.out.println("Afarin Bache Khob ");//
        }else{
            System.out.println("Omran");
        }

        if (num1.equals(num2)) {

            System.out.println("Afarin Bache Khob ");
        } else {
            System.out.println("Omran");
        }
    }

    private static void test3(){

        for (int i=1;i<11;i++){

            System.out.println("Salam"+i);

        }
//        int x = 0;
//
//        while (true){
//            x++;
//            System.out.println("Hello");
//        }



    }
}
