package com.linford.vip.springpattern.springDelegate.leader;

public class TargetB implements ITarget {
    @Override
    public void doing(String commond) {
        System.out.println("我是员工B,开始做"+commond+"工作！");
    }
}
