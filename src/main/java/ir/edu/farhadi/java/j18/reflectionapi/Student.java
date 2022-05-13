package ir.edu.farhadi.java.j18.reflectionapi;

public class Student {
    private String name;
    private int code;

    public Student(){}
    public Student(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
