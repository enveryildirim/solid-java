package com.company.dinew.services;

import com.company.dinew.dal.IAccountRepository;
import com.company.dinew.models.AccountModel;

/**
 * Kullanıcı ile alakalı işlemlerin sunulduğu servis sınıf
 * */
public class AccountService {

    private IAccountRepository accountRepository;

    public AccountService(IAccountRepository accountRepository)
    {
        accountRepository = accountRepository;
    }

    public void SaveAccount(AccountModel accountModel){
        accountRepository.SaveAccount(accountModel);
    }
}
