package com.linford.vip.springpattern.springFactory.abstr;

import com.linford.vip.springpattern.springFactory.Milk;
import com.linford.vip.springpattern.springFactory.Sanlu;
import com.linford.vip.springpattern.springFactory.Telunsu;
import com.linford.vip.springpattern.springFactory.Yili;

public class MilkFactory extends AbstractFactory {

    @Override
    public Milk getYili() {
        return new Yili();
    }

    @Override
    public Milk getSanlu() {
        return new Sanlu();
    }

    @Override
    public Milk getTelunsu() {
        return new Telunsu();
    }
}
