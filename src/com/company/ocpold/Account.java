package com.company.ocpold;

/**
 *Kullanıcı işlemlerinin yapıldığı sınıf
 *  */
public class Account {
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
