package ir.edu.farhadi.java.j8.compostion;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public  class TCPConnector {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void doConnect() {
        System.out.println("Connected to TCP");
    }
}
