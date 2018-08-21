package com.linford.vip.springpattern.springTemplate;
import com.linford.vip.springpattern.springTemplate.dao.MemberDao;

/**
 * 模板方法模式
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，
 * Template Method 使得子类可以不改变一个算法的结构
 * 即可重定义该算法的某些特定步骤。例如JDBCTemplate
 * 属于行为型模式
 * 特点：执行流程固定，但中间有些步骤有细微差别(运行时才确定)，
 * 可实现批量生产。
 * 穷举：springORM数据模型
 */
public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        memberDao.query();
    }
}
