package com.clean.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Visit {
    private int id;
    private String name;
    private String visitApartment;
    private int visitStatue;
}
