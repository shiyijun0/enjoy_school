package com.xiangxue.ch5.bq;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：延时队列测试程序
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {

        //每隔500毫秒，打印个数字
       /* for(int i=1;i<15;i++){
            Thread.sleep(500);
            System.out.println(i*500);
        }*/
       for (;;){
           System.out.println("********");
       }

        private Node enq(final Node node) {
            //CAS"自旋"，直到成功加入队尾
            for (;;) {
                Node t = tail;
                if (t == null) { // 队列为空，创建一个空的标志结点作为head结点，并将tail也指向它。
                    if (compareAndSetHead(new Node()))
                        tail = head;
                } else {//正常流程，放入队尾
                    node.prev = t;
                    if (compareAndSetTail(t, node)) {
                        t.next = node;
                        return t;
                    }
                }
            }
        }
    }
}
