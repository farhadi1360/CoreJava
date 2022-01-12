package ir.edu.farhadi.java.j12.designpatern.strategy;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class Client {
    public static void main(String[] args) {

        /*
           as you can see we can pass each strategy on runtime
         */

        ESB esb1 = new ESB(new Database());
        esb1.readAllDataByStrategy();

        ESB esb2 = new ESB(new FileSystem());
        esb2.readAllDataByStrategy();

        ESB esb3 = new ESB(new WebService());
        esb3.readAllDataByStrategy();

        ESB esb4 = new ESB(new TCPNet());

        esb1.readAllDataByStrategy();
    }

}
