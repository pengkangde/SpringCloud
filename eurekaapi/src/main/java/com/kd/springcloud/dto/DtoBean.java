package com.kd.springcloud.dto;

public class DtoBean {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DtoBean(String id) {
        this.id = id;
    }

    public DtoBean(){}
}
