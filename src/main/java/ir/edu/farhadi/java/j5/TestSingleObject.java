package ir.edu.farhadi.java.j5;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 * Singleton Pattern (GOF) -1995
 *
 */
public class TestSingleObject {
    public static void main(String[] args) {
        FileLogger obj1 = FileLogger.getFileLogger();
        FileLogger obj2 = FileLogger.getFileLogger();
        FileLogger obj3 = FileLogger.getFileLogger();
        if (obj1==obj2 && obj3==obj1){
            System.out.println("All Of The objects are Equals");
        }
        obj1.log("Hello I am Mostafa Farhadi");
        obj2.log("Hello this is Singleton Pattern");

        // use another way for create single object
//        SingeObject2 s1 = SingeObject2.getInstance();
//        SingeObject2 s2 = SingeObject2.getInstance();
//        if (s1==s2 ){
//            System.out.println("All Of The objects are Equals");
//        }
    }
}
