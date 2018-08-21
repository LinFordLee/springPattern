package com.linford.vip.springpattern.springDelegate.leader;

public class TargetA implements ITarget {
    @Override
    public void doing(String commond) {
        System.out.println("我是员工A,我开始做"+commond+"工作！");
    }
}
