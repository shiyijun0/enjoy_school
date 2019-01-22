package cn.enjoyedu.ch01.aio.client;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: vip-netty
 * @description: 测试案例
 * @author: shiyijun
 * @create: 2019-01-17 22:36
 **/
public class Test {
    public static void main(String[] args) {
        String s="df";
        String a=(new StringBuffer("df")).toString();
        String b=(new StringBuffer("df")).toString();
        String d="df";
        String c=(new StringBuilder("df")).toString();
        String c1=(new StringBuilder("df")).toString();
        System.out.println(c==c1);
       // (new ConcurrentHashMap<String,Object>(12)).put();
    }
}
