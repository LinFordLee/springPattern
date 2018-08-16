package com.linford.vip.springpattern.springFactory.simple;

import com.linford.vip.springpattern.springFactory.Milk;
import com.linford.vip.springpattern.springFactory.Telunsu;
import com.linford.vip.springpattern.springFactory.Yili;

public class SimpleFactory {
    public Milk getMilk(String name){
        if("特仑苏".equals(name)){
            return new Telunsu();
        }else if ("伊利".equals(name)){
            return new Yili();
        }else {
            System.out.println("目前暂时没有您所需要的产品，敬请期待！");
            return null;
        }
    }
}
