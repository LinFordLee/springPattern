package com.linford.vip.springpattern.springsingleton.test;

import com.linford.vip.springpattern.springsingleton.register.BeanFactory;

import java.util.concurrent.CountDownLatch;

import static sun.misc.PostVMInitHook.run;

public class BeanFactoryTest {
    public BeanFactoryTest(){}

    public static void main(String[] args) {
        int count=200;
        final CountDownLatch latch=new CountDownLatch(count);
         long start=System.currentTimeMillis();
        for (int i = 0; i < count; ++i) {
            (new Thread(){
                public  void run(){
                    try {
                        try {
                            latch.await();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        Object obj = BeanFactory.getBean("com.linford.vip.springpattern.springsingleton.test.Pojo");
                        System.out.println(System.currentTimeMillis() + ":" + obj);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();
            latch.countDown();

        }
        long end=System.currentTimeMillis();
        System.out.println("总耗时："+(end-start));
    }
}
