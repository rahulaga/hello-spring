package com.irahul.hellospring;

/**
 * A test greeter. Using a mocking framework is also an option (like EasyMock)
 * @author rahul
 *
 */
public class TestGreeter implements Greeter {

	public String sayHello() {
		return "Did you test?";
	}

}
