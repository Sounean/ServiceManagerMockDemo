package com.example.servicemanagerdemo01;

import com.example.servicemanagerdemo01.bean.UserInfo;

/**
 * @Author : Sounean
 * @Time : On 2022-08-29 20:05
 * @Description : 关于登录用户的单例模式
 * @Warn :
 */
public class ServiceSinglton {
    private static ServiceSinglton sInstance = null;
    UserInfo userInfo;

    private ServiceSinglton(){
    }

    public static synchronized ServiceSinglton getInstance(){
        if (sInstance == null){
            sInstance  = new ServiceSinglton();
        }
        return sInstance;
    }

    public  void setUser(UserInfo userInfo){this.userInfo = userInfo;}

    public UserInfo getUser( ){return userInfo;}

}
