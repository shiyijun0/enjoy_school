package com.xiangxue.ch7.tranfer.service;

import com.xiangxue.ch7.tranfer.UserAccount;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：不安全的转账动作的实现
 */
public class TrasnferAccount implements ITransfer {
	
    @Override
    public void transfer(UserAccount from, UserAccount to, int amount) 
    		throws InterruptedException {//不确定传入参数到底是from前还是to前，调用者传入参数不同，实际上不能知道谁先
        synchronized (from){//先锁转出
            System.out.println("******-2*******");
            System.out.println(Thread.currentThread().getName()
            		+" get"+from.getName());
            System.out.println("******-1*******");
            Thread.sleep(100);
            synchronized (to){//再锁转入
                System.out.println("******0*******");
                System.out.println(Thread.currentThread().getName()
                		+" get"+to.getName());
                System.out.println("******1*******");
                from.flyMoney(amount);
                System.out.println("******2*******");
                to.addMoney(amount);
                System.out.println("******3*******");
            }
        }
    }
}
