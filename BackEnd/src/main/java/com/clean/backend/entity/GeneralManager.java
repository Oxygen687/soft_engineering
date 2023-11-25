package com.clean.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GeneralManager {
    private int id;
    private String account;
    private String password;
}
