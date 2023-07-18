package ir.edu.farhadi.java.j6.fanap;

public class SqlDb extends Database{
    protected String devIP;
    protected String prodIP;

    public String getDevIP() {
        return devIP;
    }

    public void setDevIP(String devIP) {
        this.devIP = devIP;
    }

    public String getProdIP() {
        return prodIP;
    }

    public void setProdIP(String prodIP) {
        this.prodIP = prodIP;
    }
}
