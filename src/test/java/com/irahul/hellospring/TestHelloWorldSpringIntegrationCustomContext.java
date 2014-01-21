package com.irahul.hellospring;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "classpath:test-spring-beans.xml" })
public class TestHelloWorldSpringIntegrationCustomContext extends AbstractJUnit4SpringContextTests {
	
	@Autowired
	private HelloWorldSpring hws;
	
	@Autowired
	private Greeter greeter;
	
	@Test
	public void testGreeterHelloWorld(){
		System.out.println(hws.execute());
		System.out.println(greeter.sayHello());
		
		Assert.assertEquals("Did you test?", hws.execute());
	}
}
