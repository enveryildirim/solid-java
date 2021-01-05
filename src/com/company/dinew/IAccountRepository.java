package com.company.dinew;

import com.company.dinew.models.AccountModel;

import java.util.UUID;

public interface IAccountRepository {
        void SaveAccount(AccountModel account);
        AccountModel GetAccount(UUID id);
}
