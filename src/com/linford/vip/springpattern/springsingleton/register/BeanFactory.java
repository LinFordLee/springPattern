package com.linford.vip.springpattern.springsingleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

    private  static Map<String,Object> ioc=new ConcurrentHashMap<>();

    private BeanFactory(){}

    public static Object getBean(String className){
        if (!ioc.containsKey(className)){
            Object object=null;
            try {
                object=Class.forName(className).newInstance();
                ioc.put(className,object);
            }catch (Exception e){
                e.printStackTrace();
            }
            return object;
        }else {
            return ioc.get(className);
        }


    }
}
