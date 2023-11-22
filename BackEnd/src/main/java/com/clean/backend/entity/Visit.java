package com.clean.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Visit {
    private int id;
    private int visitorId;
    private String vistiorName;
    private int apartmentId;
    private String apartmentName;
    private String visitdate;
    private int visitStatue;
}
