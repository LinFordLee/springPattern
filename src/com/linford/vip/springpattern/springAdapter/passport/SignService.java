package com.linford.vip.springpattern.springAdapter.passport;

import com.linford.vip.springpattern.springAdapter.Member;
import com.linford.vip.springpattern.springAdapter.ResultMsg;

public class SignService {

    public ResultMsg register(String username,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    public  ResultMsg login(String username,String password){
        return null;
    }
}
