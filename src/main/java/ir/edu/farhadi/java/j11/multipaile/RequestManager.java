package ir.edu.farhadi.java.j11.multipaile;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class RequestManager {



    private void httpRateManege() {
        HttpRest.rateLimit();
    }

    public static void main(String[] args) {
        RequestManager requestManager = new RequestManager();
        requestManager.httpRateManege();
    }
}
