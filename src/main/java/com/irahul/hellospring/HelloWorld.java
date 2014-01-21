package com.irahul.hellospring;

import com.irahul.hellospring.impl.EnglishGreeter;

/**
 * This is how you would traditionally use dependencies
 * @author rahul
 *
 */
public class HelloWorld {
	private Greeter greeter;
	
	public HelloWorld(){
		this.greeter = new EnglishGreeter();
	}
	
	public HelloWorld(Greeter greeter) {
		this.greeter = greeter;
	}

	public String execute(){
		return greeter.sayHello();
	}
}
