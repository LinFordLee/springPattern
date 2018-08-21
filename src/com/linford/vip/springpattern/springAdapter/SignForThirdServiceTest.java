package com.linford.vip.springpattern.springAdapter;

import com.linford.vip.springpattern.springAdapter.passport.SignThirdService;

/**
 * 适配器模式
 * 属于结构型模式，注重兼容，转换，
 * 适配者与被适配者之间没有层级关系，也没有必然联系，满足has-a关系
 * 穷举：编码解码，springAOP的通知模块，一拖三充电头、 HDMI 转 VGA、Type-C 转 USB
 */
public class SignForThirdServiceTest {
    public static void main(String[] args) {
        SignThirdService service=new SignThirdService();

        //不改变原来的代码，也要能够兼容新的需求
        //还可以再加一层策略模式
        service.loginForQQ("sdfdsfsa");
    }
}
