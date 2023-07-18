package ir.edu.farhadi.java.j8.abstraction.technology;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 * in this class i am going to descrip concept of abstarc class
 * as we know the abstract class has a serveral properties
 * 1 - abstratc classes are genral concept so there is no reson for create object
 * 2 - we can not create object from abstract class
 * 3 - we have to create object only through a child of abstract class
 * 4 - we no need to object for asscess to static method of abstract class
 * 5 - we can use Abstract word for naming og abstract class  like AbstractTechnology
 * 6 - we can have serveral leveles of abstarct class
 */
public abstract class AbstractTechnology {

    public AbstractTechnology(){
        System.out.println("Call constructor of abstract Technology class");
    }

    private String name;
    private int code;


    protected String getTechnologyByCode(int code) {
        return "Technology";
    }

    public static void testStaticMethod() {
        System.out.println("this is static method of abstract class");
    }


}
