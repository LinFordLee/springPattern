package com.linford.vip.springpattern.springStrategy.paydemo;

import com.linford.vip.springpattern.springStrategy.paydemo.payport.PayType;

/**
 * 策略模式
 * 应用场景：定义一系列的算法，把他们一个个封装起来，并且使它们可相互替换，
 * 本模式使得算法可独立于使用它的客户而变化。
 *
 * 属于行为型模式，特点是最终执行结果是固定的，执行过程和执行逻辑不一样
 * 穷举：旅游出行方式，比较器，固定算法，买东西结算支付
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        //省略把商品添加到购物车，再从购物车下单，
        //直接从点单开始
        Order order=new Order("1","20180820000003",373.34);
        /*
        *开始支付，选择微信，支付宝，京东支付
        * 每个渠道它支付的具体算法是不一样的，
        * 基本算法是固定的。
         */

        //这个值在支付时才决定用哪个值
        System.out.println(order.pay(PayType.ALI_PAY));
        System.out.println(order.pay(PayType.WECHAT_PAY));
    }
}
