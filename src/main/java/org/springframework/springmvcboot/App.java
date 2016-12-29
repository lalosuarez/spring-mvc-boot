package org.springframework.springmvcboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
/*@Configuration
@EnableAutoConfiguration
@ComponentScan()*/
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Starting the application...");
        SpringApplication.run(App.class, args);
    }
}