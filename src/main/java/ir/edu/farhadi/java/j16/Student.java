package ir.edu.farhadi.java.j16;

import java.util.Objects;

public class Student {
    private String name;
    private String family;
    private int code;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", code=" + code +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return code == student.code && Objects.equals(name, student.name) && Objects.equals(family, student.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, family, code);
    }
}
