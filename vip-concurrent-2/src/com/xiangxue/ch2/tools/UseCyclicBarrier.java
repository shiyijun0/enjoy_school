package com.xiangxue.ch2.tools;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：
 */
public class UseCyclicBarrier {
	
    private static ConcurrentHashMap<String,Long> resultMap
            = new ConcurrentHashMap<>();//存放子线程工作结果的容器

    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            Thread thread = new Thread(new SubThread());
            thread.start();
        }

    }

    private static class CollectThread implements Runnable{

        @Override
        public void run() {
            StringBuilder result = new StringBuilder();
            for(Map.Entry<String,Long> workResult:resultMap.entrySet()){
            	result.append("["+workResult.getValue()+"]");
            }
            System.out.println(" the result = "+ result);
            System.out.println("do other business........");
        }
    }

    private static class SubThread implements Runnable{

        @Override
        public void run() {
        	long id = Thread.currentThread().getId();
            resultMap.put(Thread.currentThread().getId()+"",id);
            Random r = new Random();
            try {
                if(r.nextBoolean()) {
                	Thread.sleep(1000+id);
                	System.out.println("Thread_"+id+" ....do something ");
                }
                //TODO
            	Thread.sleep(1000+id);
                System.out.println("Thread_"+id+" ....do its business ");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
