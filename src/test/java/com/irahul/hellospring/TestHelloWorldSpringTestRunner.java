package com.irahul.hellospring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Note: not extending a Spring class, instead using a test runner
 * @author rahul
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-beans.xml" })
public class TestHelloWorldSpringTestRunner {
	@Autowired
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
