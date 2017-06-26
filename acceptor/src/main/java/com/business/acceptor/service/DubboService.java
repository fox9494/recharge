package com.business.acceptor.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.business.delivery.api.TestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by chenll on 2017/6/26.
 */
@Component
public class DubboService  {

    @Reference
    private TestHandler testHandler;

    public String show(String str){
        return testHandler.getHello(str);
    }
}
