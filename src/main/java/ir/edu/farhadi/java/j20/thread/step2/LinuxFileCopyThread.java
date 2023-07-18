package ir.edu.farhadi.java.j20.thread.step2;

public class LinuxFileCopyThread extends Thread {
    public void doIt() {
        System.out.println("OperatingSystem is doing **FileCopy**");
    }

    @Override
    public void run() {
        doIt();
    }
}
