package ir.edu.farhadi.java.j15.inner;
/*

    in this class im going to describe inner classs in java
    as you know the Relation uml in this case calling inclusion  or containment and its not Inheritance
    New syntax's
    Object Creation:  Protocol.new Handler() or Protocol.new SecurityCheck()
    Outer  reference: Protocol.this

 */
public class Protocol {
    private String name;
    private String code;
    public String title;

    public void setTitle(String title) {
        this.title = title;
    }


    public Protocol(String name) {
        this.name = name;
    }

    public class Handler{
        SecurityCheck securityCheck = new SecurityCheck();
        public void doHandle(){
            if(securityCheck.isSecure()){
                System.out.println("the "+Protocol.this.name+" has secured");
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
