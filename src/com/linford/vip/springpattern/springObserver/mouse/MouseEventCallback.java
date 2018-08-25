package com.linford.vip.springpattern.springObserver.mouse;

import com.linford.vip.springpattern.springObserver.core.Event;

/**
 * 观察者
 * 回调响应的逻辑，由自己实现
 */
public class MouseEventCallback {

    public void onClick(Event e){
        System.out.println("这是鼠标单击以后要执行的逻辑");
        System.out.println("=============鼠标触发单击事件==========="+"\n"+e);
    }
    public void onDoubleClick(Event e){
        System.out.println("=============鼠标触发双击事件==========="+"\n"+e);
    }
    public void onUp(Event e){
        System.out.println("=============鼠标触发弹起事件==========="+"\n"+e);
    }
    public void onDown(Event e){
        System.out.println("=============鼠标触发按下事件==========="+"\n"+e);
    }
    public void onMove(Event e){
        System.out.println("=============鼠标触发移动事件==========="+"\n"+e);
    }
    public void onWheel(Event e){
        System.out.println("=============鼠标触回滚事件==========="+"\n"+e);
    }
    public void onOver(Event e){
        System.out.println("=============鼠标触发悬停事件==========="+"\n"+e);
    }
}
