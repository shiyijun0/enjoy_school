package com.enjoy.cap5.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@Component
@Configuration
@PropertySource(value = "classpath:st.properties")
public class Teacher implements ApplicationContextAware,BeanNameAware{
    @Autowired
    public People people1;

    private ApplicationContext applicationContext;
    private String beanName;
    public void setBeanName(String s) {
        this.beanName=s;
        System.out.println("^^^^^^^^^^^****"+s);
    }

    public String getBeanName() {
        return beanName;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
public Object string(){
      Teacher teacher=(Teacher)  applicationContext.getBean("teacher");
    Student s=(Student)  applicationContext.getBean("com.enjoy.cap5.config.Student");
    s.setName("适当1234");
    System.out.println(s.getName()+"**************");
      return teacher.age+s.getName();
}
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Value("${teacher.name}")
    private String name;
   @Value("${teacher.age}")
    private int age;

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

    public Teacher() {
        System.out.println("*****误餐过程**");
    }
//@PostConstruct
    public void init(){
        System.out.println("*********初始化信息");

    }
//@PreDestroy
    public void destroy(){
        System.out.println("容器结束方法******");
    }

}
