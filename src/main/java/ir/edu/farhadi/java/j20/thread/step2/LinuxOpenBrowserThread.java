package ir.edu.farhadi.java.j20.thread.step2;

public class LinuxOpenBrowserThread extends Thread {

    public void doIt() {
        System.out.println("OperatingSystem is doing **OpenBrowser**");
    }

    @Override
    public void run() {
        doIt();
    }
}
