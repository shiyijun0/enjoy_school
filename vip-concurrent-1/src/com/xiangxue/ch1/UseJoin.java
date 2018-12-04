package com.xiangxue.ch1;

import com.xiangxue.tools.SleepTools;
/**
 * 
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：
 */
public class UseJoin {
	
    static class JumpQueue implements Runnable {
        private Thread thread;

        public JumpQueue(Thread thread) {
            this.thread = thread;
        }

        public void run() {
        	
        }
    }

    public static void main(String[] args) throws Exception {
        Thread previous = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            
            Thread thread =
                    new Thread(new JumpQueue(previous), String.valueOf(i));
            System.out.println(previous.getName()+" jump a queue the thread:"
                    +thread.getName());
            thread.start();
            previous = thread;
        }

        SleepTools.second(2);//让主线程休眠2秒
        System.out.println(Thread.currentThread().getName() + " terminate.");
    }
}
