package com.company.srpold;

import java.util.UUID;

/**
 * Kullanıcı ile alakalı bilgilerin tutulduğu ve işlemlerinin yapıldığı sınıf
 * */
public class Person {


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private UUID id;
    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;


    public void ChangePassword(String password){
        System.out.printf("Yeni Parola"+password);
    }
    public void Login(String username,String password){
        System.out.printf("Login başarılı");
    }
    public void Logout(String username){
        System.out.printf("Logout başarılı");
    }

    public void ChangeName(String name){
        System.out.printf("Yeni İsim"+name);
    }

}
