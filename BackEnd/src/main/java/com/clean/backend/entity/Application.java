package com.clean.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Application {
    private int id;
    private String name;
    private String visitApartment;

    private String visitAdministrator;
}
