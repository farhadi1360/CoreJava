package ir.edu.farhadi.java.j6.fanap;

public class Test {

    public static void main(String[] args) {

//        step1();
        step2();

    }

    public static void step1(){
        /**
         * very Bad Practice which leads to the strong coupling
         */
        Orcale orcale = new Orcale();
        orcale.getConnection();
        orcale.tuningOracleConnectionPool();
        MySql mySql = new MySql();
        mySql.tuningMySQLConnectionPool();


        Database db = orcale; // it seems like you wrote  Database db = new Orcale();

    }

    public static void step2(){
        Database db = new Orcale();
        db.getConnection();
//        db.tuningOracleConnectionPool();
//        db.generateOracleTables();
    }
    public static void step3(){
        Database db = new Orcale();
        Orcale orcaleConnection = (Orcale) db;
        orcaleConnection.getConnection();
        orcaleConnection.tuningOracleConnectionPool();
        orcaleConnection.generateOracleTables();
    }
}
