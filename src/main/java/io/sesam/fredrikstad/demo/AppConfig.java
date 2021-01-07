package io.sesam.fredrikstad.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
public class AppConfig {
    @Value("${POWERON_SOAP_URL}")
    private String url;
    
    @Value("${client.ssl.trust-store}")
    private Resource trustStore;
    
    @Value("${client.ssl.trust-store-password}")
    private String trustStorePassword;
    
    @Nullable
    public String getUrl() {
        return this.url;
    }

    @Value("${client.ssl.use-ssl}")
    private boolean useSSL = false;

    @Value("${client.ssl.trust-all}")
    private boolean trustAll = false;

    @Nullable
    public Resource getTrustStore() {
        return this.trustStore;
    }

    @Nullable
    public String getTrustStorePassword() {
        return this.trustStorePassword;
    }

    public boolean useSSL() {
        return this.useSSL;
    }

    public boolean isTrustAll() {
        return this.trustAll;
    }

    public String toString() {
        return "AppConfig{" + "url=" + this.url + ", trustStore=" + this.trustStore + ", trustStorePassword=" + this.trustStorePassword + ", useSSL=" + this.useSSL + ", trustAll=" + this.trustAll + '}';
    }
}
