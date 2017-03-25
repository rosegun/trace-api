package com.rosegun.trace.api;

import java.io.Serializable;

/**
 * <p>Created by qct on 2017/3/25.
 */
public class Endpoint implements Serializable {
    private String ip;
    private Integer port;

    public Endpoint() {
    }

    public Endpoint(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Endpoint endpoint = (Endpoint) o;

        if (!ip.equals(endpoint.ip)) return false;
        return port.equals(endpoint.port);
    }

    @Override
    public int hashCode() {
        int result = ip.hashCode();
        result = 31 * result + port.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Endpoint{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                '}';
    }
}
