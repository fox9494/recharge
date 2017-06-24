package com.business.acceptor.entity;

import com.business.acceptor.entity.enumtype.OrderType;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;

/**
 * Created by chenll on 2017/6/23.
 *
 * 下单
 */
public class PlaceOrder {

    private String merAccount;

    private String merUserAccount;

    private OrderType orderType;

    private String merOrderNo;

    //商户请求订单时间
    private Date merOrderTime;

    private String extendAccount;

    private String rechargeAccount;

    private Long rechargeValue;

    private Long rechargeNum;

    private String extendParam;

    private String attach;

    private String customerIp;

    private String notifyUrl;

    private String sign;

    public String getMerAccount() {
        return merAccount;
    }

    public void setMerAccount(String merAccount) {
        this.merAccount = merAccount;
    }

    public String getMerUserAccount() {
        return merUserAccount;
    }

    public void setMerUserAccount(String merUserAccount) {
        this.merUserAccount = merUserAccount;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public String getMerOrderNo() {
        return merOrderNo;
    }

    public void setMerOrderNo(String merOrderNo) {
        this.merOrderNo = merOrderNo;
    }

    public Date getMerOrderTime() {
        return merOrderTime;
    }

    public void setMerOrderTime(Date merOrderTime) {
        this.merOrderTime = merOrderTime;
    }

    public String getExtendAccount() {
        return extendAccount;
    }

    public void setExtendAccount(String extendAccount) {
        this.extendAccount = extendAccount;
    }

    public String getRechargeAccount() {
        return rechargeAccount;
    }

    public void setRechargeAccount(String rechargeAccount) {
        this.rechargeAccount = rechargeAccount;
    }

    public Long getRechargeValue() {
        return rechargeValue;
    }

    public void setRechargeValue(Long rechargeValue) {
        this.rechargeValue = rechargeValue;
    }

    public Long getRechargeNum() {
        return rechargeNum;
    }

    public void setRechargeNum(Long rechargeNum) {
        this.rechargeNum = rechargeNum;
    }

    public String getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(String extendParam) {
        this.extendParam = extendParam;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
