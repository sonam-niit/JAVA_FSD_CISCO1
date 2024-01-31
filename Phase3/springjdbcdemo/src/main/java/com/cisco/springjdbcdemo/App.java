package com.cisco.springjdbcdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cisco.springjdbcdemo.db.DB;
import com.cisco.springjdbcdemo.model.Dish;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Spring JDBC Demo");
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        DB dbRef= context.getBean("db",DB.class);
        
        dbRef.insertDish(new Dish(0, "Noodles", 200));
        dbRef.insertDish(new Dish(0, "Burger", 109));
        dbRef.insertDish(new Dish(0, "Pizza", 499));
    }
}
