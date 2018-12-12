package com.xiangxue.ch7.dcl;

/**
 * @author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 * 饿汉式
 */
public class SingleEHan {
    public static SingleEHan singleEHan = new SingleEHan();
    private SingleEHan(){}


    public static void main(String[] args) throws Exception {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("dffhei和地方");
            }
        }).start();

        new Thread(()-> System.out.println("更好健康")).start();



        System.out.println("*********");
    }

}
