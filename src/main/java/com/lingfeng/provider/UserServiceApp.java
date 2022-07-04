package com.lingfeng.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class UserServiceApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        app.start();
        System.out.println("用户服务启动成功...");
        // 保持服务一直在运行
        System.in.read();
    }
}
