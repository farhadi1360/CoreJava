package ir.edu.farhadi.java.j6.fanap;

public class Orcale extends SqlDb{

    public Orcale() {
        System.out.println("Calling Oracle Constructor");
    }

    @Override
    protected void getConnection() {
//        super.getConnection();
        System.out.println("get Connection From Orcle");
    }
    public void generateOracleTables(){
        System.out.println("Generate Tables");
    }
    public void tuningOracleConnectionPool(){
        System.out.println("Tuning Connection Pool");
    }
}
