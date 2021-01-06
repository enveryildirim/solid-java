package com.company.ocpnew;

/**
 * Kullanıcının şifre bilgilerini kontrol eden abstract class
 * */
public abstract class AccountVerifier {

    public boolean isValid(String password){
        if(password.length()<3){
            return false;
        }
        return true;
    }

}
