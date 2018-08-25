package com.linford.vip.springpattern.springDecorator.upgrade;


import com.linford.vip.springpattern.springDecorator.old.SigninService;

public class SigninTest {
    public static void main(String[] args) {
        ISigninForThirdService signinForThirdService=new SigninForThridService(new SigninService());
        signinForThirdService.loginForQQ("xxxxswt");
        System.out.println("登陆成功");
    }
}
