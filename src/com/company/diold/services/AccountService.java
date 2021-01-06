package com.company.diold.services;

import com.company.diold.dal.AccountRepositoryBySQL;
import com.company.diold.models.AccountModel;

/**
 * Kullanıcı ile alakalı işlemlerin sunulduğu servis sınıf
 * */
public class AccountService {

    private AccountRepositoryBySQL accountRepository=new AccountRepositoryBySQL();

    public void SaveAccount(AccountModel accountModel){
        accountRepository.SaveAccount(accountModel);
    }
}
