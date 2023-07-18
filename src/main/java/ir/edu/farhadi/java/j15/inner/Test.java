package ir.edu.farhadi.java.j15.inner;

public class Test {
    public static void main(String[] args) {



        Protocol protocol = new Protocol("RSTP");

        System.out.println(protocol.getType());


        Protocol.Handler protocolHandler = protocol.new Handler();


        System.out.println(protocolHandler.getType());



        protocolHandler.doHandle();

        Protocol.Log.doLog();
    }


}
