package com.cisco.estore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cisco.estore.bean.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Resource resource= new ClassPathResource("context.xml");
        BeanFactory factory= new XmlBeanFactory(resource);
        
        Connection conn1=(Connection) 
        		factory.getBean("conn");
        System.out.println(conn1);
        Connection conn2=(Connection) 
        		factory.getBean("conn2");
        System.out.println(conn2);
    }
}
