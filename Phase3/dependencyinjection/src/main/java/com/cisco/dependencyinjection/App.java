package com.cisco.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cisco.dependencyinjection.bean.Restaurant;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
       Restaurant obj=(Restaurant) context.getBean("rest");
       System.out.println(obj);
       
    }
}
