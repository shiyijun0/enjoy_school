package com.xiangxue.ch3;

public class Test {
    public static void main(String[] args) throws Exception {
        ThreadTest2 threadTest2=new ThreadTest2();
        for (int i=0;i<50;i++){
           Thread thread=new Thread(threadTest2,"线程"+i);
           thread.start();
        }
      //  threadTest2.join();
        Thread.sleep(100);
        System.out.println(threadTest2.getCount()+"*****");
      //  threadTest2.start();
    }
}
