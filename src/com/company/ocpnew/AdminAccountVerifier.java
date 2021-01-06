package com.company.ocpnew;

/**
 * Admin Kullanıcısının şifre bilgilerini kontrol eder
 * */
public class AdminAccountVerifier extends AccountVerifier {
    @Override
    public boolean isValid(String password) {
        if(password.length()<8)
            return false;
        return true;
    }

}
