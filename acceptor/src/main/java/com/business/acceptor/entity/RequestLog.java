package com.business.acceptor.entity;

import com.business.acceptor.entity.enumtype.RequestType;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by chenll on 2017/6/23.
 */
public class RequestLog {

    @Id
    @GeneratedValue(generator = "JDBC")//对于主键自增类型，增加此注释用于insert插入返回id值
    private Long id;

    private String data;

    private RequestType type;

    private Date createTime;

    private String createBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
