package com.linford.vip.springpattern.springPrototype.simple;

/**
 * 浅度克隆
 */
public class CloneTest {

    public static void main(String[] args) {
        CloneTarget p=new CloneTarget();
        p.name="Tom";
        p.cloneTarget=new CloneTarget();
        System.out.println(p.cloneTarget);

        try {
            CloneTarget obj= (CloneTarget) p.clone();
            System.out.println(obj.cloneTarget);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
