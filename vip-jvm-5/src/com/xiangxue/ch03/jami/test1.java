package com.xiangxue.ch03.jami;

import java.io.File;

/**
 * 加密文件
 * 加密Car.class文件。找到Car.class文件，然后拷到D：\myclasses\src\下，再在myclasses下创建一个des文件夹，
 * 运行以下代码，便会在des文件夹下生成一个加密后的Car.class文件
 */
public class test1 {
    public static void main(String[] args) throws Exception {
        File src = new File("F:\\zhihui\\github\\enjoy_school\\vip-jvm-5\\bin\\com\\xiangxue\\ch03\\jami\\Car.class");
        File des = new File("F:\\zhihui\\github\\enjoy_school\\vip-jvm-5\\src\\com\\xiangxue\\ch03\\jami\\Car.class");
        EncryptUtil.encrypt(src, des);//加密
    }

}
