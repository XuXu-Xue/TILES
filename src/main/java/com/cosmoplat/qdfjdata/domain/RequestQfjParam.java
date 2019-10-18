package com.cosmoplat.qdfjdata.domain;

import java.io.Serializable;
import java.util.List;


public class RequestQfjParam implements Serializable {

    private static final long serialVersionUID = 8889032605222527036L;
    private String start;
    private String end;
    private boolean msResolution=true;
    private List<RequestEquipment> queries;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public boolean isMsResolution() {
        return msResolution;
    }

    public void setMsResolution(boolean msResolution) {
        this.msResolution = msResolution;
    }

    public List<RequestEquipment> getQueries() {
        return queries;
    }

    public void setQueries(List<RequestEquipment> queries) {
        this.queries = queries;
    }
}
