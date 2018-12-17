package com.xiangxue.ch03.jami;
//用自定义的类加载器去加载类Car，并创建该类的对象，代码如下
public class test {
    public static void main(String[] args) {
        int a = 3;
        a = a^0xff;
        System.out.println("第一次异或运算后: a = "+a);
        a = a^0xff;
        System.out.println("第二次异或运算后: a = "+a);

        CustomClassLoader loader = new CustomClassLoader();
        loader.setBasPath("F:\\zhihui\\github\\enjoy_school\\vip-jvm-5\\src\\com\\xiangxue\\ch03\\jami\\");//指定自定义类加载器加载路径

        Class<?> clazz = null; //指定加载Car类
        try {
            clazz = loader.loadClass("Car");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(clazz.getClassLoader());//输出加载类Car的加载器

        try {
            Object object = clazz.newInstance();//创建Car类对象，会调用构造方法
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
