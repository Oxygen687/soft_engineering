package com.clean.backend.entity;

import lombok.Data;

@Data
public class Visitor {
    private int id;
    private String visitorName;
    private int type;
    private int secondaryId;

    public Visitor(int id, String visitorName, int type, int secondaryId){
        this.id = id;
        this.visitorName = visitorName;
        this.type = type;
        this.secondaryId = secondaryId;
    }
}
