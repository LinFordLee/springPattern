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
 *策略模式与模板模式对比
 * 策略模式：只有选择权(由用户自己选择已有的固定算法)
 * 模板模式：侧重的点不是选择，你没得选择，你必须这么做，你可以参与某一部分内容自定义
 */
public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        memberDao.query();
    }
}
