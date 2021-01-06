package com.company.ocpnew;

import com.company.ocpnew.AccountVerifier;

/**
 * Kullanıcı oluşturma ile alakalı işlemleri yapar.
 * */
public class Account {
   public static void CreateAccount(String username, String password, AccountVerifier accountVerifier){
     if(accountVerifier.isValid(password)){
        System.out.printf("Kullanıcı Oluşturuldu");
     }
     else
         System.out.printf("Kullanıcı Oluşturma Başarısız");
   }
}
