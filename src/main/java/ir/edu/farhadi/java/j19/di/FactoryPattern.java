package ir.edu.farhadi.java.j19.di;

public final class FactoryPattern {


    public static Calling getCall(String type) {
        Calling result = null;
        switch (type) {
            case "video":
                result = new VideoCall();
                    break;
            case "voice":
                result = new VoiceCall();
                break;
            case "message":
                result = new MessageCall();
                break;
            default:
                result = new VoiceCall();
                break;
        }
        return result;
    }
}
