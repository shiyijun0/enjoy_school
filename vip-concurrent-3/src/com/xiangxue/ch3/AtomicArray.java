package com.xiangxue.ch3;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;


/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：
 */
public class AtomicArray {
    static int[] value = new int[] { 1, 2 };
    private  static AtomicInteger atomicInteger=new AtomicInteger(2);

    public static void main(String[] args) {
     //   System.out.println(atomicInteger.get());
        int a=atomicInteger.get();
        int d=atomicInteger.incrementAndGet();
        System.out.println("*******d"+d);
        System.out.println(a);
        int c=a+30;
        boolean b=atomicInteger.compareAndSet(3,c);
        if(b){
            System.out.println(c+"*****"+b);
        }
        System.out.println(atomicInteger.getAndSet(40));
        System.out.println(atomicInteger.get());
        // atomicInteger.
    }
}
