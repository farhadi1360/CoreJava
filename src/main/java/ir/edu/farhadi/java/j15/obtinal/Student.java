package ir.edu.farhadi.java.j15.obtinal;

public class Student {
    private String name;
    private String family;
    private int code;

    public Student() {
    }

    public Student(String name, String family, int code) {
        this.name = name;
        this.family = family;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
