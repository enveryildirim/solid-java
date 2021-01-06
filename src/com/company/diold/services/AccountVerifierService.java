package com.company.diold.services;

import com.company.diold.dal.AccountRepositoryByMongo;

import java.util.UUID;

/**
 * Kullanıcı ile alakalı doğrulama işlemlerin sunulduğu servis sınıf
 * */
public class AccountVerifierService {

    private AccountRepositoryByMongo accountRepository=new AccountRepositoryByMongo();


    public boolean VerifyAccount(UUID id){
        return accountRepository.GetAccount(id) == null;
    }
}
