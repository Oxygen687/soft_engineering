package com.clean.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class VipVisitor {
    private int id;
    private String company;
    private String licensePlateNumber;
}
