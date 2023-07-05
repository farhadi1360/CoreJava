package ir.edu.farhadi.java.j6.fanap;

public class Test {

    public static void main(String[] args) {
        Database db = new Database();

        SqlDb sqlDb = (SqlDb) db;
        Orcale orcale = (Orcale) sqlDb;
       orcale.getConnection();

    }
}
