package ir.edu.farhadi.java.j11.fanap.model;

public class Teacher extends Human{
    private String grade;
    private String field;

    public Teacher(String name, String family,String grade, String field) {
        super(name, family);
        this.grade = grade;
        this.field = field;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
