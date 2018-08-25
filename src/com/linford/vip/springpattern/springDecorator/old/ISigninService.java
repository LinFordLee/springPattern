package com.linford.vip.springpattern.springDecorator.old;



public interface ISigninService {
    public ResultMsg regist(String username,String password);

    public  ResultMsg login(String username,String password);
}

