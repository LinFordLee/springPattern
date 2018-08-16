package com.linford.vip.springpattern.springProxy.cglib;

public class CglibTest {
    public static void main(String[] args) {
        try {
            Tom tom= (Tom) new CglibMeipo().getInstance(Tom.class);
            tom.findLove();
            System.out.println("-------------------------");
//            System.out.println(tom.getClass());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
