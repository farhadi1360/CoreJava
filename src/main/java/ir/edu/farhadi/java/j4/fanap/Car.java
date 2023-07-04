package ir.edu.farhadi.java.j4.fanap;

public class Car {
    private String title;
    private int code;
    public static String Company_ID ="10";

    public final static int SYSTEM_CODE = 20;

    public Car(String title, int code) {
        this.title = title;
        this.code = code;
    }
    public Car() {}
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
