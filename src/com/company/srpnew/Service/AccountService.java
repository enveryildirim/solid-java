package com.company.srpnew.Service;

import com.company.srpnew.Account;

public class AccountService {
    public void Login(Account account){
        System.out.printf("Login başarılı");
    }
    public void Logout(Account account){
        System.out.printf("Logout başarılı");
    }
    public void ChangePassword(Account account,String newpassword){
        System.out.printf("Yeni parola");
    }
}
