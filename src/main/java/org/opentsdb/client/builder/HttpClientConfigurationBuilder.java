package org.opentsdb.client.builder;

public class HttpClientConfigurationBuilder {

    private Integer connectTimeout;
    private Integer readTimeout;
    private Integer waitTimeout;

    private HttpClientConfigurationBuilder() {
    }

    public static HttpClientConfigurationBuilder builder() {
        return new HttpClientConfigurationBuilder();
    }

    public HttpClientConfiguration build() {
        return new HttpClientConfiguration(this.connectTimeout, this.readTimeout, this.waitTimeout);
    }

    public HttpClientConfigurationBuilder connectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    public HttpClientConfigurationBuilder readTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    public HttpClientConfigurationBuilder waitTimeout(Integer connectTimeout) {
        this.waitTimeout = connectTimeout;
        return this;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Integer getWaitTimeout() {
        return waitTimeout;
    }

    public void setWaitTimeout(Integer waitTimeout) {
        this.waitTimeout = waitTimeout;
    }
}
