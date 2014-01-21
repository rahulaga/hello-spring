package com.irahul.hellospring;

/**
 * A Spring version
 * @author rahul
 *
 */
public class HelloWorldSpring {
	private Greeter greeter;
	
	public void setGreeter(Greeter greeter){
		this.greeter=greeter;
	}
	
	public String execute(){
		return greeter.sayHello();
	}
}
