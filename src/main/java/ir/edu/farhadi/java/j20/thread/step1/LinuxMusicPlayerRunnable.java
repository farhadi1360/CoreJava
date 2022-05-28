package ir.edu.farhadi.java.j20.thread.step1;

public class LinuxMusicPlayerRunnable implements Runnable {
    public void doIt() {
        System.out.println("OperatingSystem is doing **MusicPlayer**");
    }

    @Override
    public void run() {
        doIt();
    }
}
