package com.company.ocpnew;

public abstract class AccountVerifier {

    public boolean isValid(String password){
        if(password.length()<3){
            return false;
        }
        return true;
    }

}
