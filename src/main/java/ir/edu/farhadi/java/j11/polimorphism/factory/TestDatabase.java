package ir.edu.farhadi.java.j11.polimorphism.factory;

import ir.edu.farhadi.java.j11.marker.Database;

import java.sql.DatabaseMetaData;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class TestDatabase {

    public static void main(String[] args) {
        DataBase dataBase = DatabaseFactory.getDataBase("");
        dataBase.getConnection();
    }
}
