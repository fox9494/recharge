package com.business.acceptor.dao;

import com.business.acceptor.entity.TStudent;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by chenlile on 17-3-17.
 */
@Mapper
public interface TStudentMapper {


    public void insert(TStudent person);
}
