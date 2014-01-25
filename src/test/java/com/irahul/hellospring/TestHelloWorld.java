package com.irahul.hellospring;

import org.junit.Assert;
import org.junit.Test;

import com.irahul.hellospring.impl.HindiGreeter;

/**
 * Test the traditional class (not using Spring)
 * @author rahul
 *
 */
public class TestHelloWorld {

	@Test
	public void testHelloWorld1(){
		HelloWorld hw = new HelloWorld();
		Assert.assertEquals("Hello World!", hw.execute());
		
		System.out.println(hw.execute());
	}
	
	@Test
	public void testHelloWorld2(){
		Greeter hindiGreeter = new HindiGreeter();
		HelloWorld hw = new HelloWorld(hindiGreeter);		
		Assert.assertEquals("Namaste", hw.execute());
		
		System.out.println(hw.execute());
	}
}
