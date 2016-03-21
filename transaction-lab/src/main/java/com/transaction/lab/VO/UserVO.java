package com.transaction.lab.VO;

import com.transaction.lab.entity.UserEntity;

import java.io.Serializable;

/**
 * Created by jean on 3/15/16.
 */
public class UserVO implements Serializable {

    private String name;

    private String email;

    public UserEntity toEntity(){
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setEmail(email);
        return userEntity;
    }

    //**********************************
    // Getters & Setters
    //**********************************

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
