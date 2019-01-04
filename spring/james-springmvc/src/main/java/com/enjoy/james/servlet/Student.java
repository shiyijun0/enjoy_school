package com.enjoy.james.servlet;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private int age;
    public final static int count=20;
    public static String school="桥北中学";

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
}
