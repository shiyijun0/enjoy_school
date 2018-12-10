package com.xiangxue.ch3;

import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：
 */
public class UseAtomicInt {
	private   int a=100;
	static  AtomicBoolean atomicBoolean=new AtomicBoolean(false);

   static Runnable runnable=new Runnable() {
       UseAtomicInt b=new UseAtomicInt();
        @Override
        public void run() {
         //   if (atomicBoolean.compareAndSet(false, true)) {
                while (true) {
                    if (b.a-- > 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + b.a);
                    } else {
                       // atomicBoolean.compareAndSet(true,false);
                        break;
                    }
                }

          //  }


            System.out.println("***********");
        }
    };

    public static void main(String[] args) {
    	Thread thread=new Thread(runnable,"线程"+new UseAtomicInt().a);
    	thread.start();

        Thread thread1=new Thread(runnable,"线程"+19);
        thread1.start();

        Thread thread2=new Thread(runnable,"线程"+18);
        thread2.start();

        Thread thread3=new Thread(runnable,"线程"+17);
        thread3.start();

        Thread thread4=new Thread(runnable,"线程"+16);
        thread4.start();

        Thread thread5=new Thread(runnable,"线程"+15);
        thread5.start();

    }
}
