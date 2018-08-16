package com.linford.vip.springpattern.springsingleton.lazy;

/**
 * 使用synchronized修饰的懒汉式单例
 */
public class LazyTwo {
    private  LazyTwo(){}

    private static  LazyTwo lazytwo;

    public static synchronized LazyTwo getInstance(){
        if (lazytwo==null){
            lazytwo=new LazyTwo();
        }
        return  lazytwo;
    }
}
