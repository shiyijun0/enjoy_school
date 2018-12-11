package com.xiangxue.ch5.bq;

import java.util.concurrent.DelayQueue;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：测试延时订单
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
    	
    	DelayQueue<ItemVo<Order>> queue = new DelayQueue<>();

    	new Thread(new PutOrder(queue)).start();
    	Thread t = new Thread(new FetchOrder(queue));
    	t.start();

       // ConcurrentSkipListMap concurrentSkipListMap
        //每隔500毫秒，打印个数字
        for(int i=1;i<20;i++){
            Thread.sleep(500);
            System.out.println(i*500);
            if(i==19){
                System.out.println("开始准备中断线程");
                t.interrupt();
            }
        }
    }
}
