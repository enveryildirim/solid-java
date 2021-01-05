package com.company.diold.services;

import com.company.diold.AccountRepository;
import com.company.diold.models.AccountModel;

public class AccountService {

    private AccountRepository _accountRepository=new AccountRepository();

    public void SaveAccount(AccountModel accountModel){
        _accountRepository.SaveAccount(accountModel);
    }
}
