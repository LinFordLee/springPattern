package com.linford.vip.springpattern.springFactory.simple;

import com.linford.vip.springpattern.springFactory.Yili;

/**
 * 小作坊式的生产模式
 *  用户本身不再关心生产的过程，而只需要关心这个结果
 */
public class SimpleFactorTest {
    public static void main(String[] args) {
        //这个new的过程实际上一个比较复杂的过程
        //有人民币及不需要自己new了
        //System.out.println(new Yili().getName());


        //假如：特仑苏、伊利、蒙牛
        //成分配比都是不一样的
        SimpleFactory factory=new SimpleFactory();
        //把用户的需求告诉工厂
        //创建产品的过程隐藏了，对于用户而且完全不清楚是怎么产生的
        System.out.println(factory.getMilk("特仑苏"));
    }
}
