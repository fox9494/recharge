package com.business.delivery.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by chenlile on 17-3-14.
 */

public class ApplicationMain {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/applicationContext.xml");
        context.start();

        System.in.read();

    }
}
