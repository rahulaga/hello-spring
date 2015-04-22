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
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-beans.xml"});
 
		HelloWorldSpring hws = (HelloWorldSpring) context.getBean("helloWorld");				
		System.out.println(hws.execute());					
		Assert.assertEquals("Namaste", hws.execute());
		
		
		Greeter greeter = (Greeter) context.getBean("greeterHindi");
		System.out.println(greeter.sayHello());
	}
}
