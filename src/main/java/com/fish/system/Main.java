package com.fish.system;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by YuChi.Yu on 2017/2/22.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-application.xml"});
        context.start();
        System.in.read();
    }
}
