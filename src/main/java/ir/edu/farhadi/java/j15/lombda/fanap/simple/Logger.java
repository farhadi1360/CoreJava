package ir.edu.farhadi.java.j15.lombda.fanap.simple;



@FunctionalInterface
public interface Logger {
//    void doLog();
//    void doLog(String systemName);

    String getLog(String systemName);
   default void m1(){
       System.out.println("M1");
    }
    default void m2(){
        System.out.println("M2");
    }
    default void m3(){
        System.out.println("M3");
    }
    default void m4(){
        System.out.println("M14");
    }
}
