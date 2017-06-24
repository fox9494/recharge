package com.business.acceptor.dao;

import com.business.acceptor.entity.TPerson;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by chenlile on 17-3-17.
 */
@Mapper
public interface TPersonMapper {


    public void insert(TPerson person);
}
