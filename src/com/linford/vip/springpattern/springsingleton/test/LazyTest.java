package com.linford.vip.springpattern.springsingleton.test;


import com.linford.vip.springpattern.springsingleton.lazy.LazyOne;
import com.linford.vip.springpattern.springsingleton.lazy.LazyThree;
import com.linford.vip.springpattern.springsingleton.lazy.LazyTwo;

public class LazyTest {

    public LazyTest(){}

    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for (int i=0;i<1000000;++i){
//            LazyThree lazyThree=LazyThree.getInstance();
            LazyTwo var4 = LazyTwo.getInstance();
        }
        long end=System.currentTimeMillis();
        System.out.println("总耗时："+(end-start));
    }
}

