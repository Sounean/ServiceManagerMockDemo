package com.example.servicemanagerdemo01.bean;

/**
 * @Author : Sounean
 * @Time : On 2022-08-29 20:07
 * @Description : UserInfo
 * @Warn :
 */
public class UserInfo {
    private String password;
    private String name;

    @Override
    public String toString() {
        return "UserInfo{" +
                "password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserInfo() {
    }

    public UserInfo(String password, String name) {
        this.password = password;
        this.name = name;
    }
}
