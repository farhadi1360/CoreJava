package ir.edu.farhadi.java.j20.thread.step1;

public class LinuxFileCopyRunnable implements Runnable {
    public void doIt() {
        System.out.println("OperatingSystem is doing **FileCopy**");
    }

    @Override
    public void run() {
        doIt();
    }
}
