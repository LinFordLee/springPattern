package com.linford.vip.springpattern.springStrategy.paydemo.payport;

import com.linford.vip.springpattern.springStrategy.paydemo.PayState;

/**
 * 支付渠道
 */
public interface Payment {
    public PayState pay(String uid,double amount);

}
