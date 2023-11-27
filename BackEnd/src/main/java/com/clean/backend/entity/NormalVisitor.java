package com.clean.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NormalVisitor {
    private int id;
    private String name;
    private String company;
    private String phone;
    private String licensePlateNumber;
    private String visitApartment;

    public NormalVisitor(String name,String company,String phone,String licensePlateNumber,String visitApartment) {
        this.name = name;
        this.company = company;
        this.phone = phone;
        this.licensePlateNumber = licensePlateNumber;
        this.visitApartment = visitApartment;
    }
}
