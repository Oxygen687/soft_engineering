package com.clean.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TemDriver {
    private int id;
    private String driverName;
    private String company;
    private String phone;
    private String licensePlateNumber;
    private int planTimes;

}
