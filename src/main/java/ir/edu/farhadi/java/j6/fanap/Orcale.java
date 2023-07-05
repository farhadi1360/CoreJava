package ir.edu.farhadi.java.j6.fanap;

public class Orcale extends SqlDb{

    @Override
    protected void getConnection() {
//        super.getConnection();
        System.out.println("get Connection From Orcle");
    }
}
