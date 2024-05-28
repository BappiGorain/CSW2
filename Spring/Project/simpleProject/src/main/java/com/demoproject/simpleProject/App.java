package com.demoproject.simpleProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // Using ordinary
        Car c1 = new Car();
        c1.drive();
        
        // Using Container        
        ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
        
        Vehical c2 = (Car) container.getBean("car_id");
        c2.drive();
    }
}
