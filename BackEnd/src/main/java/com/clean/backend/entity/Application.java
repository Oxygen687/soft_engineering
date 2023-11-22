package com.clean.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Application {
    private int id;
    private int visitorId;
    private String visitorName;
    private int apartmentId;
    private String apartmentName;
    private String administrator_id;
    private int applicationStatue;
}
