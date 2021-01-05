package com.company.diold.services;

import com.company.diold.AccountRepository;

import java.util.UUID;

public class AccountVerifierService {

    private AccountRepository _accountRepository=new AccountRepository();


    public boolean VerifyAccount(UUID id){
        return _accountRepository.GetAccount(id) == null;
    }
}
