package ir.edu.farhadi.java.j8.configuration;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 * in this class i described how we can blend singletone and builder pattern
 */
public final class SystemConfigBuilder {
    private SystemConfigBuilder() {
    }

    private String ip;
    private String port;
    private String serviceName;
    private String url;
    private static final SystemConfigBuilder systemConfig = new SystemConfigBuilder();

    public static SystemConfigBuilder getSystemConfig() {
        return systemConfig;
    }

    public SystemConfigBuilder ip(String ip) {
        this.ip = ip;
        return this;
    }

    public SystemConfigBuilder port(String port) {
        this.port = port;
        return this;
    }

    public SystemConfigBuilder serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public SystemConfigBuilder url(String url) {
        this.url = url;
        return this;
    }

//    public SystemConfigBuilder build() {
//        return this;
//    }

    @Override
    public String toString() {
        return "SystemConfigBuilder{" +
                "ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
