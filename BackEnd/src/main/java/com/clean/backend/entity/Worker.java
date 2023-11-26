package com.clean.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Worker {
    private int id;
    private String name;
    private String company;
    private String phone;
    private String licensePlateNumber;
    private String visitApartment;
    private String cardId;
}
