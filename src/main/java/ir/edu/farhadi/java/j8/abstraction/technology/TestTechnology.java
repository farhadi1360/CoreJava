package ir.edu.farhadi.java.j8.abstraction.technology;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class TestTechnology {
    public static void main(String[] args) {
//        AbstractTechnology technology1 = new AbstractTechnology();
        AbstractTechnology abstractTechnology = new ITAbstractTechnology();
        String techName = abstractTechnology.getTechnologyByCode(10);
        System.out.println(techName);

        abstractTechnology.testStaticMethod();

        AbstractTechnology.testStaticMethod();


    }
}
