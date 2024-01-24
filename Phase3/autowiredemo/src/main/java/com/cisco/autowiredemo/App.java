package com.cisco.autowiredemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cisco.autowiredemo.bean.User;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
       User user= context.getBean("user",User.class);
       
       System.out.println(user);
       
    }
}
