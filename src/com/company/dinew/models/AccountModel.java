package com.company.dinew.models;

import java.util.UUID;

public class AccountModel {
    private UUID id;
    private String name;
    private String surname;

    public AccountModel(UUID id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }


}
