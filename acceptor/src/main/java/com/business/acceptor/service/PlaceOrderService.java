package com.business.acceptor.service;

import com.business.acceptor.dao.RequestLogMapper;
import com.business.acceptor.entity.RequestLog;
import com.business.acceptor.entity.enumtype.RequestType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by chenll on 2017/6/24.
 */
@Service
public class PlaceOrderService {

    @Autowired
    private RequestLogMapper requestLogMapper;


    @Transactional
    public void saveLog(RequestType requestType,String data){
        RequestLog requestLog = new RequestLog();
        requestLog.setData(data);
        requestLog.setCreateBy("Unkown");
        requestLog.setCreateTime(new Date());
        requestLog.setType(RequestType.PLACEORDER);
        requestLogMapper.insert(requestLog);
    }
}
