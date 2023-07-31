package ir.edu.farhadi.java.j15.inner;
/*

    in this class im going to describe inner classs in java
    as you know the Relation uml in this case calling inclusion  or containment and its not Inheritance
    New syntax's
    Object Creation:  Protocol.new Handler() or Protocol.new SecurityCheck()
    Outer  reference: Protocol.this

 */
public class Protocol extends Device /*Inheritance */{

    private String name;
    private String code;
    public String title;
    /* composition0n */
    private Handler handler;


    public Protocol(String name) {
        this.name = name;
        System.out.println("call constructor of Protocol ");

        setType("Protocol Type");
    }

    /*  inclusion */
    public class Handler extends Device{

        private String encryption="SHA256";
        public Handler() {
            System.out.println("call constructor of Handler ");
            setType("Handler Type");
        }

        SecurityCheck securityCheck = new SecurityCheck();
        public void doHandle(){
            if(securityCheck.isSecure()){
                System.out.println("the " + Protocol.this.name + " has secured" + " with " + this.encryption + " Algorithm");
            }
        }

    }

    private class SecurityCheck {
        public boolean isSecure(){
            return true;
        }
    }

    public static class Log{
        public static void doLog() {
            System.out.println("Logger");
        }
    }

}
