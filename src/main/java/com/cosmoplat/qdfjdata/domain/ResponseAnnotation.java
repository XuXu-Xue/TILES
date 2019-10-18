package com.cosmoplat.qdfjdata.domain;

import org.apache.coyote.Response;

import java.io.Serializable;
import java.util.List;

public class ResponseAnnotation implements Serializable {

    private static final long serialVersionUID = 220121129413948003L;

    private String tsuid;
    private String description;
    private String notes;
    private List<ResponseCustom> custom;
    private Long startTime;
    private Long endTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTsuid() {
        return tsuid;
    }

    public void setTsuid(String tsuid) {
        this.tsuid = tsuid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<ResponseCustom> getCustom() {
        return custom;
    }

    public void setCustom(List<ResponseCustom> custom) {
        this.custom = custom;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}
