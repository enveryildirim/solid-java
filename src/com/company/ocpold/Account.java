package com.company.ocpold;

public class Account {
   public String username;
   public String password;

   public static void CreateAccount(String username,String password){
     if(AccountVerifier.isValidPassword(password)){
        System.out.printf("Oluşturuldu");
     }else System.out.printf("Başarısız");


   }
    public static void CreateAccountAdmin(String username,String password){
       if(AccountVerifier.isValidPasswordAdmin(password)){
           System.out.printf("Oluşturuldu");
       }else System.out.printf("Başarısız");


    }
}
