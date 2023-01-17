package com.dalong;

public class UserLoginImpl implements UserLogin{
    @Override
    public String token(String userName, String password) {
        return String.format("%s--------%s",userName,password);
    }
}
