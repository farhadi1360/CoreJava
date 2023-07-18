package ir.edu.farhadi.java.j19.di;

public class VideoCall implements Calling{
    @Override
    public void call(String name, String phoneNumber) {
        System.out.println("Config All Setting For Connecting By **Video** Call");
        System.out.println("Start Calling !!!!");
        try {
            Thread.sleep(4000);
            System.out.println("Mr ".concat(name).concat(" is connecting with you by Video Call "));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
