package com.xiangxue.ch5.bq;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.LinkedBlockingQueue;

public class map {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String,String> concurrentSkipListMap=new ConcurrentSkipListMap<>();
//跳跃队列
        concurrentSkipListMap.put("sd","5rt");
        concurrentSkipListMap.put("we","5tg");
        concurrentSkipListMap.put("3r","5yh");
       /* for (Object s:concurrentSkipListMap.keySet()){
          Set  d=(Set)s;
            System.out.println(d.size());
        }*/
        ArrayBlockingQueue arrayBlockingQueue=new ArrayBlockingQueue(10);
        LinkedBlockingQueue linkedBlockingQueue=new LinkedBlockingQueue();

        PriorityQueue priorityQueue=new PriorityQueue();

        System.out.println(System.nanoTime()+"**********"+System.currentTimeMillis());


        System.out.println( "sdf".hashCode());
        System.out.println( "a1".hashCode());
        ConcurrentLinkedDeque concurrentLinkedDeque=new ConcurrentLinkedDeque();
        concurrentLinkedDeque.add("34");
        concurrentLinkedDeque.add("12");
        concurrentLinkedDeque.offer("56");
        System.out.println(concurrentLinkedDeque.peek());
        System.out.println(concurrentLinkedDeque.poll());
        System.out.println(concurrentLinkedDeque);



    }
}
