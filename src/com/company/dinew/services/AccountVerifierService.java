package com.company.dinew.services;

import com.company.dinew.dal.IAccountRepository;

import java.util.UUID;

/**
 * Kullanıcı ile alakalı doğrulama işlemlerin sunulduğu servis sınıf
 * */
public class AccountVerifierService {

    private IAccountRepository accountRepository;

    public AccountVerifierService(IAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public boolean VerifyAccount(UUID id){
        return accountRepository.GetAccount(id) == null;
    }
}
