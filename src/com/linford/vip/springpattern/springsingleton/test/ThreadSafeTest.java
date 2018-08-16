package com.linford.vip.springpattern.springsingleton.test;

import com.linford.vip.springpattern.springsingleton.lazy.LazyOne;

import java.util.concurrent.CountDownLatch;

/**
 * java.util.concurrent.CountDownLatch
 * 一个同步辅助类，在完成一组正在其他线程中执行的操作之前，它允许一个或多个线程一直等待。
 * 用给定的计数 初始化 CountDownLatch。
 * 由于调用了 countDown() 方法，所以在当前计数到达零之前，await 方法会一直受阻塞。
 * 之后，会释放所有等待的线程，await 的所有后续调用都将立即返回。这种现象只出现一次——计数无法被重置。
 * 如果需要重置计数，请考虑使用 CyclicBarrier。
 * 是一个通用同步工具
 * 将计数 1 初始化的 CountDownLatch 用作一个简单的开/关锁存器，或入口：
 * 在通过调用 countDown() 的线程打开入口前，所有调用 await 的线程都一直在入口处等待。
 * 用 N 初始化的 CountDownLatch 可以使一个线程在 N 个线程完成某项操作之前一直等待，或者使其在某项操作完成 N 次之前一直等待。
 * 特性：它不要求调用 countDown 方法的线程等到计数到达零时才继续，而在所有线程都能通过之前，它只是阻止任何线程继续通过一个 await。
 */
public class ThreadSafeTest {
    public  ThreadSafeTest (){}

    public static void main(String[] args) {
        int count = 500;
        final CountDownLatch latch = new CountDownLatch(count);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; ++i) {
            (new Thread() {
                public void run() {
                    try {
                        try {
                            latch.await();//使当前线程在锁存器倒计数至零之前一直等待，除非线程被中断。
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        Object obj = LazyOne.getInstance();
                        System.out.println(System.currentTimeMillis() + ":" + obj);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            latch.countDown();//递减锁存器的计数，如果计数到达零，则释放所有等待的线程。
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));
    }
}
