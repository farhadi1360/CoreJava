package ir.edu.farhadi.java.j20.thread.step2;


import ir.edu.farhadi.java.j20.nothread.LinuxFileCopy;
import ir.edu.farhadi.java.j20.nothread.LinuxMusicPlayer;
import ir.edu.farhadi.java.j20.nothread.LinuxOpenBrowser;
import ir.edu.farhadi.java.j20.nothread.LinuxTextEdit;

public class Test {

    public static void main(String[] args) throws InterruptedException {

//        simpleWay();
//        AnonymousWay();
        LambdaWay();
//        methodReferenceWay();
    }

    private static void simpleWay() throws InterruptedException {
        new LinuxFileCopyThread().start();
        new LinuxMusicPlayerThread().start();
        new LinuxOpenBrowserThread().start();
        new LinuxTextEditThread().start();
    }

    private static void AnonymousWay() throws InterruptedException {
        new Thread() {
            @Override
            public void run() {
                new LinuxFileCopy().doIt();
            }
        }.start();
        Thread.sleep(10);
        new Thread() {
            @Override
            public void run() {
                new LinuxMusicPlayer().doIt();
            }
        }.start();
        Thread.sleep(50);
        new Thread() {
            @Override
            public void run() {
                new LinuxOpenBrowser().doIt();
            }
        }.start();
        Thread.sleep(70);
        new Thread() {
            @Override
            public void run() {
                new LinuxTextEdit().doIt();
            }
        }.start();
        Thread.sleep(20);
    }

    private static void LambdaWay() throws InterruptedException {
        new Thread(() -> new LinuxFileCopy().doIt()).start();
        Thread.sleep(20);
        new Thread(() -> new LinuxMusicPlayer().doIt()).start();
        Thread.sleep(20);
        new Thread(() -> new LinuxOpenBrowser().doIt()).start();
        Thread.sleep(20);
        new Thread(() -> new LinuxTextEdit().doIt()).start();
        Thread.sleep(20);
    }

    private static void methodReferenceWay() throws InterruptedException {
        new Thread(LinuxFileCopy::doIt).start();
        Thread.sleep(20);
        new Thread(LinuxMusicPlayer::doIt).start();
        Thread.sleep(20);
        new Thread(LinuxOpenBrowser::doIt).start();
        Thread.sleep(20);
        new Thread(LinuxTextEdit::doIt).start();
        Thread.sleep(20);
    }

}
