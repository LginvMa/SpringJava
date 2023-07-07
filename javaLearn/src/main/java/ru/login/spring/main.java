package ru.login.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean1 = context.getBean("testBean1",TestBean.class);
        System.out.println(testBean1.getName());

        context.close();
    }
}
