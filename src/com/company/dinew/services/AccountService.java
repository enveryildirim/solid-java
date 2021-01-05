package com.company.dinew.services;

import com.company.dinew.IAccountRepository;
import com.company.dinew.models.AccountModel;

public class AccountService {

    private IAccountRepository _accountRepository;

    public AccountService(IAccountRepository accountRepository)
    {
        _accountRepository = accountRepository;
    }

    public void SaveAccount(AccountModel accountModel){
        _accountRepository.SaveAccount(accountModel);
    }
}
