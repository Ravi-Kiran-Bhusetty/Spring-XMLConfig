package org.example;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //Getting bean from IoC container. Below two ways are possible
        // Only a single object will be created because the default scope is Singleton
        Alien alien = context.getBean(Alien.class);
        alien.code();

        Alien alien2 = context.getBean("alien", Alien.class);
        alien2.code();

    }
}
