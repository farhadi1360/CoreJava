package ir.edu.farhadi.java.j8;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class TestSystemConfig {
    public static void main(String[] args) {
        SystemConfigBuilder builder = SystemConfigBuilder.getSystemConfig();
        SystemConfigBuilder config = builder
                .ip("127.0.0.1")
                .port("7001")
                .serviceName("PIS")
                .url("/api/vi/pis")
                .build();
        System.out.println(config);


    }
}
