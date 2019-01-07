package com.enjoy.james.servlet;

import com.enjoy.james.annotation.EnjoyController;
import com.enjoy.james.annotation.EnjoyQualifier;
import com.enjoy.james.annotation.EnjoyRequestMapping;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
@EnjoyController("shiyij")
@EnjoyRequestMapping("/syj")
public class Student implements Serializable,Istudent {
   @EnjoyQualifier
    private String name;
    private int age;
    public final static int count=20;
    public static String school="桥北中学";

    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String string(String name,int age){
        return name+age;
    }
    public static void main(String[] args) throws Exception {
        Class cla=Student.class;
        Class cla1=(new Student()).getClass();
        Class cla2=null;
        try {
            cla2=Class.forName("com.enjoy.james.servlet.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Student student=(Student) cla.newInstance();
        Student student1=(Student)cla.getConstructor(String.class,int.class).newInstance("水电费",200);
        System.out.println(student1.getAge());
        Field field=cla.getDeclaredField("name");
        field.setAccessible(true);
        field.set(student,"史蒂夫");
        System.out.println(student.getName());
        Method method=cla.getDeclaredMethod("setAge", int.class);
        method.setAccessible(true);
        method.invoke(student,300);
        System.out.println(student.getAge());

        Method method1=cla.getDeclaredMethod("string", String.class, int.class);
        method1.setAccessible(true);

        System.out.println(method1.invoke(student,"sdf对方",23));
        System.out.println(method1.getName());

        Field field1=cla.getDeclaredField("teacher");
        field1.setAccessible(true);
        field1.set(student,new Teacher());
        student.teacher.setName("顺丰到付");
        System.out.println(student.teacher.getName());
        System.out.println(field1.getName());
        System.out.println(((Teacher)(field1.get(student))).getName());
        System.out.println("**********");

        if(cla.isInstance(new Student())){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        if(cla.isAnnotationPresent(EnjoyController.class)){
            EnjoyController controller=(EnjoyController)cla.getAnnotation(EnjoyController.class) ;
            System.out.println(controller.value());
        }

        if(cla.isAnnotation()){
            for (Annotation annotations:cla.getAnnotations()){
                System.out.print(annotations+"\t");
            }
        }

        System.out.println("*************");
        String path="./james/query/dff";
        System.out.println(path.split("/")[0]);
        for (String a:path.split("/")){
            System.out.print(a+"\t");
        }

     Istudent istudent=(Student)   cla.newInstance();
        System.out.println(istudent);
        System.out.println(istudent.string("sf",300));

        //student.getClass().
        //method1.getParameterTypes()

    }
}
