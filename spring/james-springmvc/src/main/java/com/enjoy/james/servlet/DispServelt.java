package com.enjoy.james.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DispServelt extends HttpServlet{
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //启动tomcat 是就启动javabean  把放入ioc容器里中去
        //1.先扫描哪些类需要被实例化class类（包和包以下的class文件），项目运行都在class文件中运行的，是编译后的文件
        doScanPackage("com.enjoy");
    }

    public DispServelt() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
    //扫描我们的class类 就是我们的包下位置
    private void doScanPackage(String basePackage){
        //类加载器   扫描编译好的项目路径下的所有的类
        URL url= this.getClass().getClassLoader().getResource("/"+basePackage.replaceAll("\\.","/"));
        String fileStr=url.getFile();
        File file=new File(fileStr);
        String[] files=file.list();//所有的文件被拿到了



    }

    public static void main(String[] args) {
       // DispServelt servelt=new DispServelt();
       // servelt.doScanPackage("com.enjoy");
        System.out.println("com.enjoy".replaceAll("\\.","/"));
    }
}
