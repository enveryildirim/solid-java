package com.company.lspold;

/**
 * Kullanıcı işlemlerini yapan sınıf
 * */
class AccountService{

    public  void Login(User user){
        System.out.println(" USer Login oldu");
    }
    /**
     * Admin için eklediğimiz yeni login fonksiyonu
     * */
    public  void LoginAdmin(Admin admin){
        System.out.println("Admin Login oldu");
    }
}

public class Main {

    public static void main(String[] args) {

        AccountService accountService = new AccountService();

        User user=new User("user","password");
        accountService.Login(user);

        Admin admin = new Admin("admin","admin");
        accountService.LoginAdmin(admin);

    }
}
