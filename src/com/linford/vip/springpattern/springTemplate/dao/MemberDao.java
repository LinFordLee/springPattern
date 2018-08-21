package com.linford.vip.springpattern.springTemplate.dao;

import com.linford.vip.springpattern.springTemplate.JdbcTemplate;
import com.linford.vip.springpattern.springTemplate.RowMapper;
import com.linford.vip.springpattern.springTemplate.entity.Member;

import java.sql.ResultSet;
import java.util.List;

public class MemberDao {
    //为啥不继承，主要是为了解耦
    private JdbcTemplate jdbcTemplate=new JdbcTemplate(null);

//    public List<?> query(){
//        String sql="select * from t_number";
//        return jdbcTemplate.executeQuery(sql, new RowMapper<Member>() {
//            @Override
//            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
//                Member member=new Member();
//                member.setUsername(rs.getString("username"));
//                member.setPassword(rs.getString("password"));
//                member.setAge(rs.getInt("age"));
//                member.setNickname(rs.getString("nickname"));
//                member.setAddr(rs.getString("addr"));
//                return  member;
//            }
//        },null);
//    }
    public List<?> query(){
        String sql = "select * from t_member";
        return jdbcTemplate.executeQuery(sql,new RowMapper<Member>(){
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        },null);
    }

}
