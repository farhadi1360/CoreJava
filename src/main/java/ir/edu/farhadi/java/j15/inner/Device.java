package ir.edu.farhadi.java.j15.inner;

public abstract class Device {
    String type;

    public Device(){
        System.out.println("Call Device ");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
