package com.xiangxue.ch01;

public enum me {
    SUN("电饭锅",34),FIR("r发给",56),THI("发过火",34);
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    me(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println(me.FIR.getAge());
    }
}
