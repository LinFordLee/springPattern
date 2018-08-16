package com.linford.vip.springpattern.springsingleton.hungry;

/**
 *饿汉式单例模式
 * 它是在类加载时就立即初始化，并且创建单例对象
 * 优点：没有加任何的锁，执行效率比较高，在用户体验上来说，比懒汉式更好
 * 缺点：类加载时就初始化，以占用了内存，以空间换时间。
 * 绝对线程安全，在线程还没出现以前就实例化了，不可能存在访问安全问题
 *
 */
public class Hungry {
    /**
     * 先静态后动态
     * 先属性后方法，
     * 先上后下
     *
     */
    private final static Hungry hungry=new Hungry();

    private Hungry() {

    }

    private static Hungry getInstance(){
        return hungry;
    }

}
