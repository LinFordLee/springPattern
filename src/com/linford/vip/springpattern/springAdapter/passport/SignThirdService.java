package com.linford.vip.springpattern.springAdapter.passport;

import com.linford.vip.springpattern.springAdapter.ResultMsg;

/**
 * 稳定的方法不去动，直接继承下来
 */
public class SignThirdService extends SignService{

    public ResultMsg loginForQQ(String openId){
        //1.openId是全局唯一，我们可以把它当做是一个用户名(加长)
        //2.密码默认为QQ_EMPTY
        //3.注册(在原有系统里面创建一个用户)
        //4.调用原来的登录方法
        return  loginForRegist(openId,null);
    }

    public  ResultMsg loginForWechat(String openId){return null;}

    public  ResultMsg loginForToken(String token){
        //通过token拿到用户信息，然后再重新登陆一次
        return null;
    }
    public ResultMsg loginForTelphone(String telphone,String code){return null;}
    public ResultMsg loginForRegist(String username, String password) {
        super.register(username,null);
        System.out.println("注册成功！");
        return super.login(username,null);
    }


}
