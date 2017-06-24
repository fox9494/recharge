package com.business.acceptor.service;


import com.business.acceptor.dao.RequestLogMapper;
import com.business.acceptor.dao.TPersonMapper;
import com.business.acceptor.dao.TStudentMapper;
import com.business.acceptor.entity.RequestLog;
import com.business.acceptor.entity.TPerson;
import com.business.acceptor.entity.TStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by chenlile on 17-3-15.
 */

@Service
public class MyService {

 /*   @Autowired
    private TPersonMapper tPersonMapper;

    @Autowired
    private TStudentMapper tStudentMapper;*/

 @Autowired
 private RequestLogMapper requestLogMapper;


    public String doService(){
        return "doService method";
    }


    @Transactional
    public void addPerson(TPerson person){
//        tPersonMapper.insert(person);
//
//
//        TPerson person2 = new TPerson();
//        person2.setAge(12);
//        person2.setBirth(new Date());
//        person2.setName("cd");
//
//
//        tPersonMapper.insert(person2);
    }

    @Transactional
    public void insert(RequestLog requestLog){
        requestLogMapper.insert(requestLog);
    }

    @Transactional(value = "sencondTransaction")
    public void addStudent(TStudent student){
//        tStudentMapper.insert(student);
//
//        TStudent tStudent2 = new TStudent();
//        tStudent2.setAge(55);
//        tStudent2.setName("zhijia");
//        tStudent2.setBirth(new Date());
//
//
//        tStudentMapper.insert(tStudent2);

    }
}
