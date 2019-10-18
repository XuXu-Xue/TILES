package com.cosmoplat.qdfjdata.domain;

import java.io.Serializable;

public class ResponseCustom  implements Serializable {

    private static final long serialVersionUID = 8895266020958667928L;
    private String metric;
    private String tags;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
