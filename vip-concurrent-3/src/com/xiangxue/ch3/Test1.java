package com.xiangxue.ch3;

public class Test1 {
    public static void main(String[] args) {
        Service service = new Service();
        service.test();
        System.out.println("我要停止他。。。。");
        service.setFlag(false);
    }
}
class Service{
    private boolean flag = true;
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
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

