package com.xiangxue.ch7.dcl;

/**
 * @author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 * 懒汉式-类初始化模式
 */
public class SingleInit {
    private SingleInit(){}

    //定义一个私有类，来持有当前类的实例
    private static class InstanceHolder{
        public static SingleInit instance = new SingleInit();
    }

    private static class user{
        private String name;
    }

    public static SingleInit getInstance(){
        return InstanceHolder.instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance()==getInstance());

        int a=4;
        int b=4;
        System.out.println(a==b);
         a=5;
        System.out.println(a==b);
        user user=new user();
        user.name="水电费";
        user user1=user;
        System.out.println(user==user1);
        System.out.println(user1.name);
        user.name="电饭锅";
        System.out.println(user1.name);

    }
}
