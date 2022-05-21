package ir.edu.farhadi.java.j19.di;

public class VoiceCall implements Calling{

    @Override
    public void call(String name, String phoneNumber) {
        System.out.println("Config All Setting For Connecting By **Voice** Call");
        System.out.println("Start Calling !!!!");
        try {
            Thread.sleep(4000);
            System.out.println("Mr ".concat(name).concat(" is connecting with you by Voice Call "));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
