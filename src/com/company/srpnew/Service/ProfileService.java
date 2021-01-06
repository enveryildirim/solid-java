package com.company.srpnew.Service;

import com.company.srpnew.Profile;

import java.util.UUID;

/**
 * Bu sınıf Kullanıcının profil ile alakalı işlemlerini yapar
 * */
public class ProfileService {

    public Profile getProfile(UUID id){
        return new Profile();
    }
    public void ChangeProfile(UUID id,Profile profile){
        System.out.printf("Profil Değişti");
    }
}
