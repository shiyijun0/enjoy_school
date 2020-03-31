package com.xiangxue.ch04.builder01.buildpattern.product;


/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：具体的产品
 */
public class Man extends Person {
    public Man() {
        System.out.println("create a man");
    }

    @Override
    public String toString() {
        return "Man{}";
    }
}
