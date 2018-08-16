package com.linford.vip.springpattern.springsingleton.lazy;

/**
 * 懒汉式单例
 * 特点：在外部类被调用时内部类才会被加载
 * 内部类一定是要在方法调用之前初始化
 * 巧妙的避免线程安全问题
 * 这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 *
 * 经典的单例模式实现方式
 */
public class LazyThree {

    private  boolean initialized =false;

    //默认使用LazyThree的时候，会先初始化内部类，如果没使用就不会加载内部类

    private LazyThree (){
        synchronized (LazyThree.class){
            if(initialized== false){
                initialized=!initialized;
            }else {
                throw new RuntimeException("单例已被侵犯！");
            }
        }
    }

    //static 是为了使单例的空间共享，保证这个方法不会被重写，重载
    public static final LazyThree getInstance(){
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    //默认不加载
    private static class LazyHolder{
        private static final LazyThree LAZY=new LazyThree();
    }
}
