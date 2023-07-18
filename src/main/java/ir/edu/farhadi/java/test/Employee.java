package ir.edu.farhadi.java.test;

import java.io.Serializable;

public class Employee implements Serializable {
    private int code;
    private String name;

    public Employee(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
