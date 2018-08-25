package com.linford.vip.springpattern.springObserver.mouse;

import com.linford.vip.springpattern.springObserver.core.Event;

import java.lang.reflect.Method;

public class MouseTest {

    public static void main(String[] args) {
        //观察者和被观察者之间没有必然的联系
        //注册时，才差生联系
        //目的解耦
        /*
         * var input = document.getElementById("username");
         * input.addLisenter("click",function(){
         *
         *     alert("鼠标点击了这个文本框");
         *
         * });
         *
         *
         * */
        try{
            MouseEventCallback callback=new MouseEventCallback();
            Method onclick=MouseEventCallback.class.getMethod("onClick", Event.class);
            Mouse mouse=new Mouse();
            mouse.addListener(MouseEventType.ON_CLICK,callback,onclick);
            mouse.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
