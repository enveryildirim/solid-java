package com.company.ocpnew;

public class Main {
    public static void main(String[] args) {

        Account.CreateAccount("user","user",new UserAccountVerifier());

        Account.CreateAccount("admin","admin",new AdminAccountVerifier());
    }
}
