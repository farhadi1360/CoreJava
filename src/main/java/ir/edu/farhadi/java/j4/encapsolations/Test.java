package ir.edu.farhadi.java.j4.encapsolations;

public class Test {
    public static void main(String[] args) {
//        step1();
        step2();
    }
    private static void step1(){
        Student student = new Student();
        student.name ="Mostafa";
        student.avg = 18;
        student.code = 14500;
        student.age = -40; // invalid state
        student.takeClass();

    }
    private static void step2(){
        StudentEncapsulation encapsulation = new StudentEncapsulation();
        encapsulation.writeNAme("Mostafa");
//        encapsulation.age = -40; // try to invalid state
        encapsulation.writeAge(40);
        encapsulation.takeClass();
    }

    private static void step3(){
        StudentBean studentBean = new StudentBean();
        studentBean.setName("Mostafa");
        studentBean.setAge(40);
    }
}
