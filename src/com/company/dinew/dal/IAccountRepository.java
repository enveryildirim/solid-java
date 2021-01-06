package com.company.dinew.dal;

import com.company.dinew.models.AccountModel;

import java.util.UUID;

/**
 * Kullanıcı işlemlerini temsil eden arayüz
 */
public interface IAccountRepository {
        void SaveAccount(AccountModel account);
        AccountModel GetAccount(UUID id);
}
