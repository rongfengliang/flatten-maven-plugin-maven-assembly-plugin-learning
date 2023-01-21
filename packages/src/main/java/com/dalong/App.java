package com.dalong;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Config config = ConfigFactory.load();
        int age = config.getInt("service.com.dalong.app");
        List<String> classpaths = config.getStringList("service.com.classpath");
        String loginType = config.getString("service.userlogintype");
        int newAge = config.getInt("dremio.myage");
        System.out.println(age);
        System.out.println(classpaths);
        System.out.println(loginType);
        System.out.println(newAge);
    }
}
