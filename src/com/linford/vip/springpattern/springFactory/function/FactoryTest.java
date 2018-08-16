package com.linford.vip.springpattern.springFactory.function;

public class FactoryTest {
    public static void main(String[] args) {
        //货比三家
        //不知道谁好谁好谁坏
        //配置，可能会配置错
        Factory factory=new SanluFactory();
        System.out.println(factory.getMilk());
    }
}
