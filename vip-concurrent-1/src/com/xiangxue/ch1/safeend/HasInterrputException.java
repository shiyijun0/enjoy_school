package com.xiangxue.ch1.safeend;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：
 */
public class HasInterrputException {
	
	private static class UseThread extends Thread{
		
		public UseThread(String name) {
			super(name);
		}
		
		@Override
		public void run() {
			String threadName = Thread.currentThread().getName();
			while(isInterrupted()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					System.out.println(threadName+" interrput flag is "
							+isInterrupted());
					interrupt();
					e.printStackTrace();
				}
				System.out.println(threadName);				
			}
			System.out.println(threadName+" interrput flag is "
					+isInterrupted());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread endThread = new UseThread("HasInterrputEx");
		endThread.start();
		Thread.sleep(500);
		endThread.interrupt();
		

	}

}
