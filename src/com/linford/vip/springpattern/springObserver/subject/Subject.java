package com.linford.vip.springpattern.springObserver.subject;

import com.linford.vip.springpattern.springObserver.core.EventListener;

public class Subject extends EventListener {
    //通常的话，采用动态代理实现监控，避免代码侵入
    public void add(){
        System.out.println("调用添加的方法");
        trigger(SubjectEventType.ON_ADD);
    }
    public void remove(){
        System.out.println("调用删除的方法");
        trigger(SubjectEventType.ON_RMOVE);
    }
}
