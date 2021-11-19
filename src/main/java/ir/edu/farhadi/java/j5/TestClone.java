package ir.edu.farhadi.java.j5;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class TestClone {

    /*
        in this case i want to show how is clone functionality
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student("Mostafa", "Farhadi");
        Student student2=(Student) student1.clone();
        if (student1==student2){
            System.out.println("both references are equals ");
        }else{
            System.out.println("both references are Not equals ");
        }
        if (student1.getName().equalsIgnoreCase(student2.getName()) && student1.getFamily().equalsIgnoreCase(student2.getFamily())) {
            System.out.println("both Student values are seems  ");
        }else{
            System.out.println("both Student values are NOT seems  ");
        }
    }
}
