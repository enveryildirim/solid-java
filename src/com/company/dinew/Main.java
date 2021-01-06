package com.company.dinew;

import com.company.dinew.dal.AccountRepositoryByMongo;
import com.company.dinew.dal.AccountRepositoryBySQL;
import com.company.dinew.dal.IAccountRepository;
import com.company.dinew.models.AccountModel;
import com.company.dinew.services.AccountService;
import com.company.dinew.services.AccountVerifierService;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        IAccountRepository accountRepositoryBySQL = new AccountRepositoryBySQL();
        IAccountRepository accountRepositoryByMongo = new AccountRepositoryByMongo();


        AccountService accountService = new AccountService(accountRepositoryBySQL);
        AccountVerifierService accountVerifierService = new AccountVerifierService(accountRepositoryByMongo);


        AccountModel accountModel =new AccountModel(UUID.randomUUID(),"user","user");


        accountVerifierService.VerifyAccount(accountModel.getId());
        accountService.SaveAccount(accountModel);

    }
}
