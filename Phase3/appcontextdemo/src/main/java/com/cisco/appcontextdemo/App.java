package com.cisco.appcontextdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cisco.appcontextdemo.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
      
      Student obj1=(Student) context.getBean("s1");
      Student obj2=context.getBean("s2",Student.class);
      System.out.println("First User: "+ obj1.getId()+" "+obj1.getName());
      System.out.println("Second User: "+ obj2.getId()+" "+obj2.getName());
      
      Student obj3=(Student) context.getBean("s1");//reading with s1 only
      
      System.out.println(obj1.hashCode());
      System.out.println(obj3.hashCode());
      System.out.println(obj1==obj3);
      //By Default Object scope is Singleton means if you are creating many object from same Id then also it will use one object
      
      //Change the scope by giving it in xml file
      Student obj4=context.getBean("s2",Student.class);
      System.out.println(obj2.hashCode());
      System.out.println(obj4.hashCode());
      
      ((ClassPathXmlApplicationContext) context).close();
    }
}
