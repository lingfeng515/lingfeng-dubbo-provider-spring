package com.lingfeng.provider.impl;

import com.lingfeng.provider.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String getUserNameById(String userId) {
        String userName = "userId 为\"" + userId + "\"的用户是：张三";
        return userName;
    }
}
