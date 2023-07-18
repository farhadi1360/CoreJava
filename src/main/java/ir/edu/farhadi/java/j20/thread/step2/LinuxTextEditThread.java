package ir.edu.farhadi.java.j20.thread.step2;

public class LinuxTextEditThread extends Thread {
    public void doIt() {
        System.out.println("OperatingSystem is doing **TextEdit**");
    }

    @Override
    public void run() {
        doIt();
    }
}
