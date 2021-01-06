package com.company.diold.models;

import java.util.UUID;

/**
 * Kullanıcı ile alakalı bilgilerin tutulduğu sınıf
 * */
public class AccountModel {
    public UUID getId() {
        return id;
    }

    private UUID id;
    private String name;
    private String surname;
    public AccountModel(UUID id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }


}
