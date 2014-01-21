package com.irahul.hellospring;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Load bean from XML context file manually
 * @author rahul
 *
 */
public class TestHelloWorldSpring {

	@SuppressWarnings("resource")
	@Test
	public void testHelloWorldBeans(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
 
		HelloWorldSpring obj = (HelloWorldSpring) context.getBean("helloWorld");		
		
		System.out.println(obj.execute());			
		
		Assert.assertEquals("Namaste", obj.execute());
	}
}
