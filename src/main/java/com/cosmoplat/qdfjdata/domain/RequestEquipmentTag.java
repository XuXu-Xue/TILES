package com.cosmoplat.qdfjdata.domain;

import java.io.Serializable;

public class RequestEquipmentTag implements Serializable {

    private static final long serialVersionUID = -7895617739843821034L;
    private String device_id;

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }
}
