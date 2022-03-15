package ir.edu.farhadi.java.j15.inner;

public class Test {
    public static void main(String[] args) {
        Protocol protocol = new Protocol("RSTP");
        Protocol.Handler protocolHandler = protocol.new Handler();
        protocolHandler.doHandle();

        Protocol.Log.doLog();
    }
}
