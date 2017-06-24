package com.business.acceptor.controller;

import com.business.acceptor.dao.RequestLogMapper;
import com.business.acceptor.entity.PlaceOrder;
import com.business.acceptor.entity.PlaceOrderResponse;
import com.business.acceptor.entity.RequestLog;
import com.business.acceptor.entity.enumtype.RequestType;
import com.business.acceptor.service.MyService;
import com.business.acceptor.service.PlaceOrderService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by chenll on 2017/6/23.
 */
@RestController
public class PlaceOrderController {

    private static Logger logger = LoggerFactory.getLogger(PlaceOrderController.class);

    @Autowired
    private PlaceOrderService placeOrderService;

    @ApiOperation(value = "下单接口操作",notes = "")
    @RequestMapping(value = "/orders/place",method = RequestMethod.POST)
    public PlaceOrderResponse placeOrder(@RequestBody PlaceOrder placeOrder){
        logger.info("请求订单参数,entity:{}",placeOrder.toString());
        //TODO 保存数据库
        //记录日志
        placeOrderService.saveLog(RequestType.PLACEORDER,placeOrder.toString());
        return null;
    }
}
