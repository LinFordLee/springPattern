package com.linford.vip.springpattern.springDelegate.leader;

import java.util.HashMap;
import java.util.Map;

public class Leader implements ITarget {
    private Map<String,ITarget> targers=new HashMap<String,ITarget>();

    public Leader() {
        targers.put("加密",new TargetA());
        targers.put("登陆",new TargetB());
    }

    @Override
    //项目经理自己不干活
    public void doing(String commond) {
        targers.get(commond).doing(commond);
    }
}
