package com.linford.vip.springpattern.springProxy.staticed;

public class Father {
    private  Person person;
    public Father (Person person){
        this.person=person;
    }

    //把目标的对象的引用给拿到手
    public  void findLove(){
        System.out.println("根据你的要求物色！");
        this.person.findLove();
        System.out.println("双方父母是不是同意！");
    }
}
