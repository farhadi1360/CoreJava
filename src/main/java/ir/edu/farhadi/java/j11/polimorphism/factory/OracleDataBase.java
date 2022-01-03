package ir.edu.farhadi.java.j11.polimorphism.factory;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class OracleDataBase implements DataBase{
    @Override
    public void getConnection() {
        System.out.println("get connections from oracle");
    }
}
