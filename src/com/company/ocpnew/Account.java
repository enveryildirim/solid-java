package com.company.ocpnew;

import com.company.ocpnew.AccountVerifier;

public class Account {
   public String username;
   public String password;

   public static void CreateAccount(String username, String password, AccountVerifier accountVerifier){
     if(accountVerifier.isValid(password)){
        System.out.printf("Oluşturuldu");
     }else System.out.printf("Başarısız");
   }
}
