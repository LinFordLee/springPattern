package com.linford.vip.springpattern.springFactory.function;

import com.linford.vip.springpattern.springFactory.Milk;
import com.linford.vip.springpattern.springFactory.Telunsu;

public class TelunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
