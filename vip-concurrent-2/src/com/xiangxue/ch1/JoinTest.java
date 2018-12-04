package com.xiangxue.ch1;
/**join的意思是使得放弃当前线程的执行，并返回对应的线程，例如下面代码的意思就是：
 程序在main线程中调用t1线程的join方法，则main线程放弃cpu控制权，并返回t1线程继续执行直到线程t1执行完毕
 所以结果是t1线程执行完后，才到主线程执行，相当于在main线程中同步t1线程，t1执行完了，main线程才有执行的机会
 */

//join方法的原理就是调用相应线程的wait方法进行等待操作的，例如A线程中调用了B线程的join方法，则相当于在A线程中调用了B线程的wait方法，当B线程执行完（或者到达等待时间），B线程会自动调用自身的notifyAll方法唤醒A线程，从而达到同步的目的。
public class JoinTest  {

    private static class thread implements Runnable{
        @Override
        public void run()  {
            synchronized (this) {
                /*try {
                    Thread.currentThread().wait();
                }catch (Exception e){

                }*/

                for (int i = 0; i < 30; i++) {
                    System.out.println(Thread.currentThread().getName() + "******" + i);
                }
                this.notify();
            }

        }
    }


    public  static void main(String args[]) throws InterruptedException {
             thread thread0=new thread();
        thread thread1=new thread();

        Thread t1=new Thread(thread0,"t1");
        Thread t2=new Thread(thread0,"t2");
        Thread t3=new Thread(thread0,"t3");

        synchronized (t1){
            t1.start();
            t1.wait();
           // Thread.currentThread().wait();
        }


       // Thread.currentThread().wait();
    //Thread.currentThread().notifyAll();
    // t1.join();
    t2.start();
    // t3.start();
}
        }

