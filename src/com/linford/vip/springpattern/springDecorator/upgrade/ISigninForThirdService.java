package com.linford.vip.springpattern.springDecorator.upgrade;


import com.linford.vip.springpattern.springAdapter.passport.SignService;
import com.linford.vip.springpattern.springDecorator.old.ISigninService;
import com.linford.vip.springpattern.springDecorator.old.ResultMsg;

public interface ISigninForThirdService extends ISigninService {

    public ResultMsg loginForQQ(String openId);
    public ResultMsg loginForWechat(String openId);
    public ResultMsg loginForToken(String token);
    public ResultMsg loginForTelphone(String telphone,String code);
    public ResultMsg loginForRegist(String username,String password);


}
