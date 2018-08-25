package com.linford.vip.springpattern.springObserver.subject;

import com.linford.vip.springpattern.springObserver.core.Event;

import java.lang.reflect.Method;

/**
 * 观察者模式（完成时通知我）
 * 针对目标对象的一举一动，要得到一个反馈
 * 应用场景：事件监听，日志监听，短信通知
 */
public class ObserverTest {
    public static void main(String[] args) {
        //观察者
        Observer observer=new Observer();
        try {
            Method advice=Observer.class.getMethod("advice",new Class<?>[]{ Event.class});
            //这里些目标对象
            Subject subject=new Subject();
            subject.addListener(SubjectEventType.ON_ADD,observer,advice);
            subject.addListener(SubjectEventType.ON_EDIT,observer,advice);
            subject.addListener(SubjectEventType.ON_QUERY,observer,advice);
            subject.addListener(SubjectEventType.ON_RMOVE,observer,advice);
            subject.add();
            subject.remove();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
