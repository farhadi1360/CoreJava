package ir.edu.farhadi.java.j20.thread.step1;


public class Test {

    public static void main(String[] args) {
        LinuxFileCopyRunnable fileCopy = new LinuxFileCopyRunnable();
        LinuxMusicPlayerRunnable musicPlayer = new LinuxMusicPlayerRunnable();
        LinuxOpenBrowserRunnable openBrowser = new LinuxOpenBrowserRunnable();
        LinuxTextEditRunnable textEdit = new LinuxTextEditRunnable();

        Thread threadFileCopy = new Thread(fileCopy);
        Thread threadMusicPlayer = new Thread(musicPlayer);
        Thread threadOpenBrowser = new Thread(openBrowser);
        Thread threadTextEdit = new Thread(textEdit);

        threadFileCopy.start();
        threadMusicPlayer.start();
        threadOpenBrowser.start();
        threadTextEdit.start();

    }
}
