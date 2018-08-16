package com.linford.vip.springpattern.springProxy.jdk;

import com.linford.vip.springpattern.springProxy.staticed.Person;

public class Mic implements Person {
    @Override
    public void findLove() {
        System.out.println("才华满溢！");
        System.out.println("富有幽默感！");
    }

    @Override
    public void zufangzi() {
        System.out.println("租房子");
    }

    @Override
    public void buy() {
        System.out.println("买mac");
    }

    @Override
    public void findJob() {
        System.out.println("月薪30k以上");
    }
}
