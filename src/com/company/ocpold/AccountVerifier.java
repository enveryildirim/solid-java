package com.company.ocpold;

public class AccountVerifier {

    //Herkes için
    public static boolean isValidPassword(String password){
        if(password.length()<5)
            return false;
        return true;
    }
    //Admin için
    public static boolean isValidPasswordAdmin(String password){
        if(password.length()<8)
            return false;
        return true;
    }
}
