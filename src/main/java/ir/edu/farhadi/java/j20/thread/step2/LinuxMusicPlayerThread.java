package ir.edu.farhadi.java.j20.thread.step2;

public class LinuxMusicPlayerThread extends Thread {
    public void doIt() {
        System.out.println("OperatingSystem is doing **MusicPlayer**");
    }

    @Override
    public void run() {
        doIt();
    }
}
