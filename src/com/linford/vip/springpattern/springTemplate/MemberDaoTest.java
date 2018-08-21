package com.linford.vip.springpattern.springTemplate;


import com.linford.vip.springpattern.springTemplate.dao.MemberDao;

public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        memberDao.query();
    }
}
