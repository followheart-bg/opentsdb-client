package org.opentsdb.client.builder;

public class HttpClientConfiguration {

    private final Integer connectTimeout;
    private final Integer readTimeout;
    private final Integer waitTimeout;

    HttpClientConfiguration(Integer connectTimeout, Integer readTimeout, Integer waitTimeout) {

        this.connectTimeout = connectTimeout;
        this.readTimeout = readTimeout;
        this.waitTimeout = waitTimeout;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public Integer getWaitTimeout() {
        return waitTimeout;
    }
}
