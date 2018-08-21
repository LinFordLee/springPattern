package com.linford.vip.springpattern.springStrategy.payport;

import com.linford.vip.springpattern.springStrategy.PayState;

/**
 * 支付渠道
 */
public interface Payment {
    public PayState pay(String uid,double amount);

}
