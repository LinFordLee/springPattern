package com.linford.vip.springpattern.springPrototype.deep;

public class CloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng=new QiTianDaSheng();
        QiTianDaSheng n=qiTianDaSheng.copy(qiTianDaSheng);
        System.out.println(qiTianDaSheng.jinGuBang==n.jinGuBang);
    }
}
