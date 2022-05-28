package ir.edu.farhadi.java.j20.nothread;

public class Test {

    public static void main(String[] args) {
        LinuxFileCopy fileCopy = new LinuxFileCopy();
        LinuxMusicPlayer musicPlayer = new LinuxMusicPlayer();
        LinuxOpenBrowser openBrowser = new LinuxOpenBrowser();
        LinuxTextEdit textEdit = new LinuxTextEdit();

        fileCopy.doIt();
        musicPlayer.doIt();
        openBrowser.doIt();
        textEdit.doIt();


    }

}
