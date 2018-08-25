package com.linford.vip.springpattern.springObserver.subject;

import com.linford.vip.springpattern.springObserver.core.Event;

public class Observer {
    public  void advice(Event e){
        System.out.println("------------触发事件，打印日志---------------\n"+e);
    }
}
