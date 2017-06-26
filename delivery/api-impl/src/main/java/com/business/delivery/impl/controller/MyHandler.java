package com.business.delivery.impl.controller;

import com.business.delivery.api.TestHandler;

/**
 * Created by chenll on 2017/6/24.
 */
public class MyHandler implements TestHandler {

    public String getHello(String data) {
        System.out.println("data = " + data);
        return "this is back "+data;
    }
}
