package ir.edu.farhadi.java.j5;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 * i am going to descibed a bout how can i get only one object per instans
 */
public final class FileLogger {
    /*
      i create a constructor as a private constructor so all of the developers can not use default constructor
     */
    private FileLogger() {
    }

    private static FileLogger logger = null;

    public  static FileLogger getFileLogger() {
        if (logger == null) {
            logger = new FileLogger();
        }
        return logger;
    }
    public synchronized void log(String msg){
        System.out.println("Logger : " .concat(msg));
    }
}
