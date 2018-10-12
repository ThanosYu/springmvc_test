package com.test.entity;

/**
 * @author Thanos Yu
 * @date 10/9/2018 11:51 AM
 */
public class UserEntity {

    private String name;

    private String password;

    public UserEntity(String s, String b) {
        this.name = s;
        this.password = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}