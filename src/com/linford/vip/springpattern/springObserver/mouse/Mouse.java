package com.linford.vip.springpattern.springObserver.mouse;

import com.linford.vip.springpattern.springObserver.core.EventListener;

/**
 * 被观察者
 */
public class Mouse extends EventListener {
    public void click(){
        System.out.println("鼠标单击");
        this.trigger(MouseEventType.ON_CLICK);
    }
    public void onclick(){
        System.out.println("鼠标双击");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK);
    }
    public void onup(){
        System.out.println("鼠标弹起");
        this.trigger(MouseEventType.ON_UP);
    }
    public void ondown(){
        System.out.println("鼠标按下");
        this.trigger(MouseEventType.ON_DOWN);
    }
    public void onwheel(){
        System.out.println("鼠标回滚");
        this.trigger(MouseEventType.ON_WHEEL);
    }
    public void onover(){
        System.out.println("鼠标悬停");
        this.trigger(MouseEventType.ON_OVER);
    }
    public void onmove(){
        System.out.println("鼠标移动");
        this.trigger(MouseEventType.ON_MOVE);
    }

}
