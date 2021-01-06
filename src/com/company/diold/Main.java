package com.company.diold;

import com.company.diold.dal.AccountRepositoryByMongo;
import com.company.diold.dal.AccountRepositoryBySQL;
import com.company.diold.models.AccountModel;
import com.company.diold.services.AccountService;
import com.company.diold.services.AccountVerifierService;

import java.util.UUID;

/**
 * Ana uygulama
 * */
public class Main {
    public static void main(String[] args) {

        AccountRepositoryBySQL accountRepository = new AccountRepositoryBySQL();
        AccountRepositoryByMongo accountRepository2 = new AccountRepositoryByMongo();


        AccountService accountService = new AccountService();

        AccountVerifierService accountVerifierService = new AccountVerifierService();

        AccountModel accountModel =new AccountModel(UUID.randomUUID(),"user","user");

        accountVerifierService.VerifyAccount(accountModel.getId());
        accountService.SaveAccount(accountModel);

    }
}
