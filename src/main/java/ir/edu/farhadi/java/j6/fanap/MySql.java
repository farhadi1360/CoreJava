package ir.edu.farhadi.java.j6.fanap;

public class MySql extends SqlDb{
    @Override
    protected void getConnection() {
        System.out.println("Get Connection From My SQL");
    }
}
