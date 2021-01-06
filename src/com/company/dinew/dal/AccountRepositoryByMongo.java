package com.company.dinew.dal;

import com.company.dinew.models.AccountModel;

import java.util.UUID;

/**
 * Kullanıcı işlemlerini Mongo veritabanı ile yapıldığı sınıf
 * */

public class AccountRepositoryByMongo implements IAccountRepository {
    @Override
    public void SaveAccount(AccountModel account) {

    }

    @Override
    public AccountModel GetAccount(UUID id) {
        return null;
    }
}
