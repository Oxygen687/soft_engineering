package com.clean.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Administrator {
    private int id;
    private String administratorName;
    private int password;
    private String adminapartment;
}
