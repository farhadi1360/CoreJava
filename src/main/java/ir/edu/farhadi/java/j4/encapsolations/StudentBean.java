package ir.edu.farhadi.java.j4.encapsolations;

public class StudentBean {
    public StudentBean() {
    }


    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0){
            this.age = age;
        }else {
            throw new RuntimeException("Your age is not defined in the allowed range");
        }
    }
}
