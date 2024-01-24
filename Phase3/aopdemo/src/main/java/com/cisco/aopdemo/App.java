package com.cisco.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cisco.aopdemo.bean.Product;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Product product= context.getBean("productProxy",Product.class);
        
        System.out.println(product);
        product.purchaseProduct("Home", "8 PM evening", "sonam@gmail.com");
        
    }
}
