package ir.edu.farhadi.java.j6.fanap;

public class MySql extends SqlDb{

    public MySql() {
        System.out.println("Calling MySQL Constructor");
    }

    @Override
    protected void getConnection() {
        System.out.println("Get Connection From My SQL");
    }
    public void generateMySQLTables(){
        System.out.println("Generate MySQL Tables");
    }
    public void tuningMySQLConnectionPool(){
        System.out.println("Tuning MySQL Connection Pool");
    }
}
