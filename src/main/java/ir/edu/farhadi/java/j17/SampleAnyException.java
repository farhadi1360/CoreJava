package ir.edu.farhadi.java.j17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SampleAnyException {
    public static void main(String[] args) {
//        test1RunTimeException();
//        test2RunTimeException();
//        test3RunTimeException();
//        test4RunTimeException();
//        testCheckExceptions();
//        test2CheckExceptions();
//        test3CheckExceptions();
        test4CheckExceptions();
    }

    private static void test1RunTimeException() {
        String test = "mostafa";
        int i = 0;
        i = Integer.parseInt(test);
        System.out.println("This is I : " + i);
        System.out.println("This is end of code");
    }
    private static void test2RunTimeException() {
        String test = "mostafa";
        int i = 0;
        try{
            i = Integer.parseInt(test);
            System.out.println("This is I : " + i);
        }catch (NumberFormatException ex){
            System.out.println("your input is not number");
        }
        System.out.println("This is end of code");
    }

    private static void test3RunTimeException(){
        String test = "mostafa";
        int i = 0;
        try{
            i = Integer.parseInt(test);
            System.out.println("This is I : " + i);
        }
        finally {
            System.out.println("your input is not number");
        }
        System.out.println("This is end of code");
    }
    private static void test4RunTimeException(){
        String test = "mostafa";
        int i = 0;
        try{
            i = Integer.parseInt(test);
            System.out.println("This is I : " + i);
        }catch (NumberFormatException ex){
            System.out.println("catch block say : your input is not number");
        }
        finally {
            System.out.println("finally block say :your input is not number");
        }
        System.out.println("This is end of code");
    }

    private static void test1CheckExceptions(){
        System.out.println("line 1");

        try {
            System.out.println("line 2");
            Class.forName("Meule");
            System.out.println("line 3");
        } catch(ClassNotFoundException e) {
            System.out.println("line 4");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("line 5");
    }
    private static void test2CheckExceptions(){
        FileInputStream fis = null;
        try {
            System.out.println("step 1");
            fis = new FileInputStream("test.text");
        } catch (FileNotFoundException e) {
            System.out.println("step 2");
        }
        finally {
            System.out.println("step 3");
            try {
                System.out.println("step 4");
                fis.close();
            } catch (IOException e) {
                System.out.println("step 5");
            }catch (NullPointerException ex){
                System.out.println("step 6");
            }
        }
    }
    private static void test3CheckExceptions(){
        try {
            callServiceLayer();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException handel iv view layer ");
        }
    }

    private static void test4CheckExceptions() {
        try {
            findUser();
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }



    static void callServiceLayer() throws ClassNotFoundException {
            Class.forName("Pop.PEM");

    }
    static void findUser() throws UserNotFoundException{
        try {
            Class.forName("Pop.PEM");
        } catch (ClassNotFoundException e) {
            throw new UserNotFoundException("User Does not Exist");
        }
    }
//  Swallowing Exception (Dont Do it !)
static void callAPI(){
    try {
        Class.forName("Pop.PEM");
    } catch (ClassNotFoundException e) {
        //this is Swallowing Exception
    }

}

}
