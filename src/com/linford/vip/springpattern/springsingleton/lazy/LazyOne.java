package com.linford.vip.springpattern.springsingleton.lazy;

/**
 * 懒汉式单例
 * 在外部需要使用时初始化
 */
public class LazyOne {
    private LazyOne(){};
    //静态块，公共内存区域
    private  static LazyOne lazyOne=null;

    public static LazyOne getInstance(){
        /*
        调用方法前先判断有没有初始化，若初始化了直接返回，
        若没有初始化，将其初始化，并且赋值，将实例存入缓存中
         */
        if (lazyOne==null){
            lazyOne=new LazyOne();
        }
        return lazyOne;
    }
}
