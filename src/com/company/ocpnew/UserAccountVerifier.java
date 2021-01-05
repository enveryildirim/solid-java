package com.company.ocpnew;

public class UserAccountVerifier extends AccountVerifier{
    @Override
    public  boolean isValid(String password) {
            if(password.length()<5)
                return false;
            return true;

    }
}
