package com.xiangxue.ch03.jami;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 自定义类加载器，带解密功能
 *
 * @author Jason
 *
 */
public class CustomClassLoader extends ClassLoader {

    private String name;// 类加载器的名字，方便看测试结果
    private String basPath;// 指定加载类的基本路径
    private final String FILETYPE = ".class";// 加载文件的扩展名

    public CustomClassLoader(String name) {
        super();// 让系统类加载器成为该类加载器的父加载器
        this.name = name;
    }

    public CustomClassLoader() {
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = this.loadClassData(name);
        return this.defineClass(name, data, 0, data.length);
    }

    /**
     * 加载二进制文件
     * @param name 文件名，不含扩展名
     * @return
     */
    private byte[] loadClassData(String name) {
        InputStream in = null;
        byte[] data = null;
        ByteArrayOutputStream bos = null;
        try {
            name = name.replace(".", "\\");
            in = new FileInputStream(new File(basPath + name + FILETYPE));
            bos = new ByteArrayOutputStream();
            int ch = 0;
            while (-1 != (ch = in.read())) {
                ch = ch^0xff; //解密
                bos.write(ch);
            }
            data = bos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    public void setBasPath(String basPath) {
        this.basPath = basPath;
    }

}
