package com.company.dinew.services;

import com.company.dinew.IAccountRepository;

import java.util.UUID;

public class AccountVerifierService {

    private IAccountRepository _accountRepository;

    public AccountVerifierService(IAccountRepository _accountRepository) {
        this._accountRepository = _accountRepository;
    }

    public boolean VerifyAccount(UUID id){
        return _accountRepository.GetAccount(id) == null;
    }
}
