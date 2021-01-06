package com.company.dinew.models;

import java.util.UUID;

/**
 * Kullanıcı ile alakalı bilgilerin tutulduğu sınıf
 * */
public class AccountModel {
    private UUID id;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    private String name;
    private String surname;

    public AccountModel(UUID id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }


}
