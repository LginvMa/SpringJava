package ru.login.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collections;

public class main {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = context.getBean("computer",Computer.class);

        System.out.println(computer);

        context.close();
    }
}
