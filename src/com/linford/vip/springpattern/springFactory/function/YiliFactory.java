package com.linford.vip.springpattern.springFactory.function;

import com.linford.vip.springpattern.springFactory.Milk;
import com.linford.vip.springpattern.springFactory.Yili;

public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
