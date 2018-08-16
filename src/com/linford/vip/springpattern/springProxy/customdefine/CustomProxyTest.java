package com.linford.vip.springpattern.springProxy.customdefine;


import com.linford.vip.springpattern.springProxy.jdk.Mic;
import com.linford.vip.springpattern.springProxy.staticed.Person;


public class CustomProxyTest {
    public static void main(String[] args) {
        try {
            Person obj= (Person) new CustomMeipo().getInstance(new Mic());
            System.out.println(obj.getClass());
            obj.findLove();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
