package com.cosmoplat.qdfjdata.domain;

import java.io.Serializable;
import java.util.List;


public class ResponseEquipmentData  implements Serializable {

    private static final long serialVersionUID = -6160966494120127804L;
    private String metric;

    private Object tags;
    private Object dps;
    private List<Object> aggregateTags;
    private List<ResponseAnnotation> annotations;


    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Object getDps() {
        return dps;
    }

    public void setDps(Object dps) {
        this.dps = dps;
    }

    public List<Object> getAggregateTags() {
        return aggregateTags;
    }

    public void setAggregateTags(List<Object> aggregateTags) {
        this.aggregateTags = aggregateTags;
    }

    public List<ResponseAnnotation> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<ResponseAnnotation> annotations) {
        this.annotations = annotations;
    }
}
