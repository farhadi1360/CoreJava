package ir.edu.farhadi.java.j18.reflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflectionAPI {

    public static void main(String[] args) throws ClassNotFoundException {

//        step1();
//        step2();
//        step3();
//        step4();
    }

    private  static void step1(){
        Student student = new Student();
        Class c = student.getClass();
        printCatalogOfClass(c);

    }

    /**
     * in this method we do not need to an object
     * @throws ClassNotFoundException
     */
    private static void step2() throws ClassNotFoundException {
        Class c = Class.forName("ir.edu.farhadi.java.j18.reflectionapi.Student");
        printCatalogOfClass(c);
    }

    /**
     * in this way , Like the previous example we do not need an object
     * but we use hard code class name -> i means Class Literals
     */
    private static void step3() {
        Class c = Student.class;
        printCatalogOfClass(c);
    }

    private static void step4() {
        Class std = Student.class;
        Class srv = StudentService.class;
        printTest(std);
        printTest(srv);
    }

    private static void step5() throws InstantiationException, IllegalAccessException {
        Student student = new Student();
        student.setName("Mostafa");
        Student student1 = Student.class.newInstance();


    }





    private static void  printCatalogOfClass(Class c) {
        System.out.println("Name Of Class is : " + c.getName());
        System.out.println("***********************************");
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method  Of Class is : " + method);
        }
        System.out.println("***********************************");
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field  Of Class is : " + field);
        }
        Constructor[] constructors = c.getDeclaredConstructors();
        System.out.println("***********************************");
        for (Constructor constructor : constructors) {
            System.out.println("Constructor  Of Class is : " + constructor);
        }
    }

    private static void printTest(Class c){
        System.out.println("***********************************");
        System.out.println("Name Of Class is : " + c.getName());
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println("Method  Of Class is : " + method);
        }
    }
}
