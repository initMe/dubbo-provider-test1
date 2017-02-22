package com.fish.api.impl;

import com.fish.api.HelloApi;

import java.util.Random;

/**
 * Created by YuChi.Yu on 2017/2/22.
 */
public class HelloApiImpl implements HelloApi {

    public String sayHello(String content) {

        try {
            Thread.sleep(new Random().nextInt(500));
            System.out.println(Thread.currentThread().getId() + "----"+ content);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello" + content;
    }
}
