package com.linford.vip.springpattern.springObserver.core;

import java.lang.reflect.Method;

/**
 * 事件
 */
public class Event {

    //事件源
    private  Object source;
    //通知目标
    private  Object target;
    //回调
    private Method callback;
    //触发
    private String trigger;
    //时间
    private long time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public Object getTarget() {
        return target;
    }

    public Method getCallback() {
        return callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public long getTime() {
        return time;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    Event setTrigger(String trigger) {

        this.trigger = trigger;
        return this;
        
    }

    Event setTime(long time){
        this.time=time;
        return  this;
    }

    Event setSource(Object source){
        this.source=source;
        return this;
    }

    @Override
    public String toString() {
        return "Event{" +
                "\n\tsource=" + source +
                ",\n\t target=" + target +
                ",\n\tcallback=" + callback +
                ",\n\t trigger='" + trigger + '\'' +"\n"+
                '}';
    }
}
