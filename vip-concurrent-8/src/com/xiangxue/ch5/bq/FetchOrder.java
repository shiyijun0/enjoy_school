package com.xiangxue.ch5.bq;

import java.util.concurrent.DelayQueue;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：取出到期订单的功能
 */
public class FetchOrder implements Runnable {
	
	private DelayQueue<ItemVo<Order>> queue;
	
	public FetchOrder(DelayQueue<ItemVo<Order>> queue) {
		super();
		this.queue = queue;
	}	

	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("线程取出是不是阻塞了");
				System.out.println(Thread.currentThread().isInterrupted()+"**34****");
				if(Thread.currentThread().isInterrupted()){
					System.out.println("线程终于中断了********");
					break;
				}
				ItemVo<Order> item = queue.take();
				System.out.println("线程取出真实是阻塞了******");
				Order order = (Order)item.getDate();
				System.out.println("get from queue:"+order.getOrderNo());
				System.out.println(Thread.currentThread().isInterrupted()+"******");

			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		}
	}	
}
