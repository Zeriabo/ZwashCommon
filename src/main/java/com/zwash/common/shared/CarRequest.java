package com.zwash.common.shared;


import java.io.Serializable;

public class CarRequest implements Serializable {
    private Long id;

    public CarRequest() {
    }

    public CarRequest(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
