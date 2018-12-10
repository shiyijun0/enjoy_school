package com.xiangxue.ch3;

public class ThreadTest2 extends Thread {
    private static int count;

    public int getCount() {
        return count;
    }

    @Override
    public   void run() {
        count++;
        System.out.println(Thread.currentThread().getName()+":"+count);
    }
}
