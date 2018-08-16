package com.linford.vip.springpattern.springFactory.abstr;

import com.linford.vip.springpattern.springFactory.Milk;

/**
 * 抽象工厂是用户的主入口
 * 在Spring中应用得最为广泛的一种设计模式
 * 易于扩展
 */
public abstract class AbstractFactory {

    /*
    公共的逻辑,方便于统一管理
     */

    public abstract Milk getTelunsu();

    public abstract Milk getSanlu();

    public abstract Milk getYili();

}
