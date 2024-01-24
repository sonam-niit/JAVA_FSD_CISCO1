package com.cisco.inheritancedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cisco.inheritancedemo.bean.Pizza;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Pizza pizza= context.getBean("pizza",Pizza.class);
        System.out.println(pizza);
    }
}
