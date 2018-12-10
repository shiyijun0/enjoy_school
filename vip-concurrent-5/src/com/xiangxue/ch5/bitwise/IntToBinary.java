package com.xiangxue.ch5.bitwise;

import java.io.UnsupportedEncodingException;

public class IntToBinary {
	
    public static void main(String[] args) throws UnsupportedEncodingException {
        int a=8;//1000
        int b=7; //0111
        int c=5;//0110
       // System.out.println(Integer.toBinaryString(b));

        System.out.println(a&c );//0000
       // System.out.println(Integer.toBinaryString(a&b));
        System.out.println("******1******");
        System.out.println(a|b );//1111
      //  System.out.println(Integer.toBinaryString(a|b));
        System.out.println("******2******");
        System.out.println(~c);//111
        System.out.println("*****3*******");

        System.out.println(a^b);// 同值取0，异值取1  1111
        System.out.println("*****3*******");

        System.out.println(a<<2);// 有符号左移
        System.out.println("*****3*******");

        System.out.println(a>>>2);// 有符号右移
        System.out.println("*****3*******");

    } 
}
