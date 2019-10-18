package com.cosmoplat.qdfjdata.domain;

import java.io.Serializable;
import java.util.List;

public class RequestEquipment implements Serializable {

    private static final long serialVersionUID = 2541526229596010330L;
    private String aggregator;
    private String metric;
    private String rate;
    private RequestEquipmentTag tags;

    public String getAggregator() {
        return aggregator;
    }

    public void setAggregator(String aggregator) {
        this.aggregator = aggregator;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public RequestEquipmentTag getTags() {
        return tags;
    }

    public void setTags(RequestEquipmentTag tags) {
        this.tags = tags;
    }
}
