package ir.edu.farhadi.java.j11.polimorphism.factory;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class DatabaseFactory {
    public static DataBase getDataBase(String type) {
        DataBase dataBase;
        switch (type) {
            case "ORA":
                dataBase = new OracleDataBase();
                break;
            case "MYSQL":
                dataBase = new MySqlConnection();
                break;
            case "SQL":
                dataBase = new SqlServer();
                break;
            default:
                dataBase = new OracleDataBase();
        }
        return dataBase;
    }
}
