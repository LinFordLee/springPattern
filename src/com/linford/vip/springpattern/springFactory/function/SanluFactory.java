package com.linford.vip.springpattern.springFactory.function;

import com.linford.vip.springpattern.springFactory.Milk;
import com.linford.vip.springpattern.springFactory.Sanlu;

public class SanluFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Sanlu();
    }
}
