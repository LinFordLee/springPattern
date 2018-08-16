package com.linford.vip.springpattern.springsingleton.test;

import com.linford.vip.springpattern.springsingleton.lazy.LazyThree;

import java.lang.reflect.Constructor;

public class LazyThreeTest {
    public LazyThreeTest(){}

    public static void main(String[] args) {
        Class<?> clazz=LazyThree.class;
        try {
            Constructor c=clazz.getDeclaredConstructor((Class[] )null);
//            System.out.println(c.getName());
            c.setAccessible(true);
            Object o1=c.newInstance();
            Object o2=c.newInstance();
            System.out.println(o1==o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
