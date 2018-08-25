package com.linford.vip.springpattern.springDecorator.upgrade;


import com.linford.vip.springpattern.springDecorator.old.ISigninService;
import com.linford.vip.springpattern.springDecorator.old.ResultMsg;

public class SigninForThridService implements ISigninForThirdService {
    private ISigninService service;

    public SigninForThridService(ISigninService service) {
        this.service = service;
    }




    public ResultMsg regist(String username, String password) {
        return service.regist(username,password);
    }


    public ResultMsg login(String username, String password) {
        return service.login(username,password);
    }



    public ResultMsg loginForQQ(String openId) {
        //1.openId是全局唯一，我们可以把它当作是一个用户名（加长）
        //2.密码默认为QQ_EMPTY
        //3.注册（在原有系统里面创建一个用户）
        //4.调用原有的登陆方法
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelphone(String telphone, String code) {
       //通过token拿到用户信息，然后再从新登陆了一次
        return null;
    }


    public ResultMsg loginForRegist(String username, String password) {
        this.regist(username,null);
        return this.login(username,null);
    }
}
