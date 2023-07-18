package ir.edu.farhadi.java.j5.pattern.singlton;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 * Singleton Pattern (GOF) -1995
 *
 */
public class TestSingleObject {
    public static void main(String[] args) {
//        FileLogger obj1 = FileLogger.getFileLogger();
//        FileLogger obj2 = FileLogger.getFileLogger();
//        FileLogger obj3 = FileLogger.getFileLogger();

//        FileLogger obj1 = new FileLogger();
//        FileLogger obj2 = new FileLogger();
//        FileLogger obj3 = new FileLogger();
//        if (obj1==obj2 && obj3==obj1){
//            System.out.println("All Of The objects are Equals");
//        }else{
//            System.out.println("Ma Barabar Nistim");
//        }
//        obj1.log("Hello I am Mostafa Farhadi");
//        obj2.log("Hello this is Singleton Pattern");

        // use another way for create single object
        SingeObject2 s1 = SingeObject2.getInstance();
        SingeObject2 s2 = SingeObject2.getInstance();
        if (s1==s2 ){
            System.out.println("All Of The objects are Equals");
        }
        s1.log("Hello I am Mostafa Farhadi");
        s2.log("Hello this is Singleton Pattern");
    }
}
