package com.irahul.hellospring;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Note extending AbstractJUnit4SpringContextTests which is a spring-test class
 * @author rahul
 *
 */

@ContextConfiguration(locations = { "classpath:spring-beans.xml" })
public class TestHelloWorldSpringIntegration extends AbstractJUnit4SpringContextTests {
	
	@Autowired
	@Qualifier("helloWorld")
	private HelloWorldSpring hws;
	
	@Autowired
	@Qualifier(value="greeterHindi")
	private Greeter greeter;
	
	@Test
	public void testAutowiredHelloWorld(){
		System.out.println(hws.execute());
		System.out.println(greeter.sayHello());
		
		Assert.assertEquals("Namaste", hws.execute());
	}
}
