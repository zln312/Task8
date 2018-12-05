package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainService {

    public static void main(String[] args) {

        System.setProperty("java.rmi.server.hostname","118.190.199.167");
        ApplicationContext a = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("服务启动！！！");
    }
}
