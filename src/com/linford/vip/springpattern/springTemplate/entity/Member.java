package com.linford.vip.springpattern.springTemplate.entity;

public class Member {

    private String username;
    private String password;
    private String nickname;

    private int age;
    private String addr;

    public Member() {
    }

    public Member(String username, String password, String nickname, int age, String addr) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.age = age;
        this.addr = addr;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
