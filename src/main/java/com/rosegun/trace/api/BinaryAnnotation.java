package com.rosegun.trace.api;

import java.io.Serializable;

/**
 * <p>Created by qct on 2017/3/25.
 */
public class BinaryAnnotation implements Serializable {
    private String key;
    private String value;
    private String type;
    private Integer duration;
    private Endpoint host;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Endpoint getHost() {
        return host;
    }

    public void setHost(Endpoint host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "BinaryAnnotation{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", type='" + type + '\'' +
                ", duration=" + duration +
                ", host=" + host +
                '}';
    }
}
