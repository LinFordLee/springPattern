package com.linford.vip.springpattern.springStrategy;

/**
 * 支付完成的状态
 */
public class PayState {
    private int code;
    private String msg;
    private Object data;


    public PayState(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return ("支付状态：["+code+"],"+msg+"支付详情：[,"+data+"]");
    }
}
