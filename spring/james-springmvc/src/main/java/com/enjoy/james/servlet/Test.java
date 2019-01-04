package com.enjoy.james.servlet;


import java.net.URL;

public class Test {
      URL url= this.getClass().getClassLoader().getResource("/"+"com.enjoy".replaceAll("\\.","/"));
     private  URL d(){
         return url;
     }
    /* static Runnable runnable =()->{}
         System.out.println("东风风光**********");*/

    public static void main(String[] args) throws Exception {
        System.out.println("com.enjoy".replaceAll("\\.","/"));
     /*  Test test=new Test();
        System.out.println(test.d());*/
    Student student=new Student();
        Student student1=new Student();
        student.setAge(20);

        System.out.println(student1.getAge()+"**********"+student.getAge());

        System.out.println(Student.count+"******"+Student.school);
        Student.school="东风风光";
        System.out.println(Student.count+"******"+Student.school);
        Class cal=Student.class;
        Class cal1=Student.class;
      Class cal2=Class.forName("com.enjoy.james.servlet.Student");


    }
}
