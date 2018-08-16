package com.linford.vip.springpattern.springsingleton.seriable;

import java.io.Serializable;

public class Seriable implements Serializable {
    public static final Seriable INSTANCE=new Seriable();

    private Seriable(){}

    public static Seriable getInstance(){
        return INSTANCE;
    }
    private Object readResolve(){
        return INSTANCE;
    }
}
