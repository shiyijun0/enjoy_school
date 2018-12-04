package com.xiangxue.ch2.tools;

import java.util.concurrent.CountDownLatch;

import com.xiangxue.tools.SleepTools;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：
 */
public class UseCountDownLatch {
	

    private static class InitThread implements Runnable{

        @Override
        public void run() {
        	System.out.println("Thread_"+Thread.currentThread().getId()
        			+" ready init work......");
        	//TODO
            for(int i =0;i<2;i++) {
            	System.out.println("Thread_"+Thread.currentThread().getId()
            			+" ........continue do its work");
            }
        }
    }
    
    private static class BusiThread implements Runnable{

        @Override
        public void run() {
            //TODO
            for(int i =0;i<3;i++) {
            	System.out.println("BusiThread_"+Thread.currentThread().getId()
            			+" do business-----");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
            	SleepTools.ms(1);
                System.out.println("Thread_"+Thread.currentThread().getId()
            			+" ready init work step 1st......");
              //TODO
                System.out.println("begin step 2nd.......");
                SleepTools.ms(1);
                System.out.println("Thread_"+Thread.currentThread().getId()
            			+" ready init work step 2nd......");
              //TODO
            }
        }).start();
        new Thread(new BusiThread()).start();
        for(int i=0;i<=3;i++){
            Thread thread = new Thread(new InitThread());
            thread.start();
        }

      //TODO
        System.out.println("Main do ites work........");
    }
}
