package ir.edu.farhadi.java.j11.fanap.model;

public class Student extends Human{
    private int studentCode;
    private int score;



    public Student(String name, String family, int studentCode, int score) {
        super(name, family);
        this.studentCode = studentCode;
        this.score = score;
    }


    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
