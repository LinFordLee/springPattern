package com.linford.vip.springpattern.springDecorator.old;

public class SigninService implements ISigninService {
    @Override
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200,"注册成功",new Member());
    }

    @Override
    public ResultMsg login(String username, String password) {
        return null;
    }
}
