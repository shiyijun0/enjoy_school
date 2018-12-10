package com.xiangxue.ch3;

public class Test2 {
    public static void main(String[] args) {
        final Service2 s2 = new Service2();
        Thread thread = new Thread(new  Runnable() {
            public void run() {
                s2.test();
            }
        },"service2");
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("我要停止他。。。。");
        s2.setFlag(false);
    }
}
class Service2{
    private volatile boolean flag = true;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public void test(){
        while(flag){
            System.out.println("run test threadName="+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


}
