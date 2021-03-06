package com.linford.vip.springpattern.springsingleton.register;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RegisterMap {
    private static Map<String,Object> register =new ConcurrentHashMap<String, Object>();

    private RegisterMap(){}

    public  static  RegisterMap getInstance(String name){
        if (name==null){
            name=RegisterMap.class.getName();
        }
        if (register.get(name)==null){
            try {
                register.put(name,new RegisterMap());

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return (RegisterMap) register.get(name);
    }
}
