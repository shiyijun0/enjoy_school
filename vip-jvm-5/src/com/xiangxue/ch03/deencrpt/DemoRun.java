package com.xiangxue.ch03.deencrpt;

public class DemoRun {

    public static void main(String[] args) throws Exception {
        //F:\zhihui\github\enjoy_school\vip-jvm-5\src\com\xiangxue\ch03\deencrpt\DemoUser.java
        //F:\zhihui\github\enjoy_school\vip-jvm-5\bin
        CustomClassLoader demoCustomClassLoader 
        	= new CustomClassLoader("My ClassLoader");
        demoCustomClassLoader.setBasePath("F:\\zhihui\\github\\enjoy_school\\vip-jvm-5\\bin\\com\\xiangxue\\ch03\\deencrpt\\");
        Class<?> clazz = 
        		demoCustomClassLoader.findClass("DemoUser");
        System.out.println(clazz.getClassLoader());
        Object o = clazz.newInstance();
        System.out.println(o);
        //new User(xxx,yyyy,ddd);//
    }
}
