package com.company.lspnew;

/**
 * Kullanıcı işlemlerini yapan sınıf
 * */
class AccountService{

    public  void Login(User user){
        System.out.println("Login oldu");
    }
}

public class Main {

    public static void main(String[] args) {

        AccountService accountService = new AccountService();

        User user=new User("user","password");
        accountService.Login(user);

        Admin admin = new Admin("admin","admin");
        accountService.Login(admin);

    }
}
