package com.company.ocpnew;

public class AdminAccountVerifier extends AccountVerifier {
    @Override
    public boolean isValid(String password) {
        if(password.length()<8)
            return false;
        return true;
    }

}
