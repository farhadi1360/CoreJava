package ir.edu.farhadi.java.j20.thread.step1;

public class LinuxTextEditRunnable implements Runnable {
    public void doIt() {
        System.out.println("OperatingSystem is doing **TextEdit**");
    }

    @Override
    public void run() {
        doIt();
    }
}
