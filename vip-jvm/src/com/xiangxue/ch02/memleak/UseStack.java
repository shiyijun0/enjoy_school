package com.xiangxue.ch02.memleak;

import com.xiangxue.User;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public class UseStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Object o = new Object();
        System.out.println("o="+o);
        stack.push(o);
        Object o1 =  stack.pop();
        System.out.println("o1="+o1);

        
        System.out.println(stack.elements[0]);

        System.out.println("***************");
        User user=new User("mark",1);
        SoftReference<User> softReference=new SoftReference<User>(user);
        WeakReference<User> weakReference=new WeakReference<User>(user);
        user=null;
        System.out.println(softReference.get().getName()+"*****软引用**");
        System.out.println("***如引用***"+weakReference.get().getName());
        System.gc();

        System.out.println(softReference.get().getName()+"*****软引用1**");
        System.out.println("***如引用1***"+weakReference.get().getName());

        List<byte[]> list=new LinkedList<>();

       /* try {
            for(int i=0;i<100;i++){
                System.out.println(softReference.get().getName()+"*****软引用2**");
                list.add(new byte[1024*1024*1]);

            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(softReference.get().getName()+"*****软引用throw**");
        }*/


        long s=System.currentTimeMillis();
        for (int i=0;i<1000;i++){
          User  user1=new User();
            System.out.println("***********"+user1);
        }
        long d=System.currentTimeMillis();
        System.gc();
        System.out.println("时间段"+(d-s));
    }


}
