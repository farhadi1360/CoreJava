package ir.edu.farhadi.java.j8.compostion;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class ServiceBus {
    /*
        in composition we can have  multipart inheritances
        and we can use final class for usage as inheritances whereas we can not use it in normal state
     */
    private DatabaseConnector databaseConnector = new DatabaseConnector();
    private FTPConnector ftpConnector = new FTPConnector();
    private HttpConnector httpConnector = new HttpConnector();
    private TCPConnector tcpConnector = new TCPConnector();


    public void getDatabaseConnector() {
        databaseConnector.doConnect();
    }

    public void getFTPConnector() {
        ftpConnector.doConnect();
    }

    public void getHttpConnector() {
        httpConnector.doConnect();
    }

    public void getTCPConnector() {
        tcpConnector.doConnect();
    }

}
