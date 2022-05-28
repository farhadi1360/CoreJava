package ir.edu.farhadi.java.j20.thread.step1;

public class LinuxOpenBrowserRunnable implements Runnable {

    public void doIt() {
        System.out.println("OperatingSystem is doing **OpenBrowser**");
    }

    @Override
    public void run() {
        doIt();
    }
}
