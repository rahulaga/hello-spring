#Hello Spring

Copyright (C) 2014 Rahul Agarwal
http://www.irahul.com
This work is licensed under the Creative Commons Attribution-NonCommercial 4.0 International License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc/4.0/deed.en_US.

Sample bean wirings using Spring Framework and corresponding JUnit tests

HelloWorld becomes multi-lingual here and based on a specific language Greeter implementation it saysHello.

`HelloWorld` and `TestHelloWorld`: "Traditional" way without Spring

`HelloWorldSpring` is a simple POJO - not Spring annotations or dependencies
`spring-beans.xml` defines the Spring beans

`TestHelloWorldSpring`, `TestHelloWorldSpringIntegration` load the above context in two different ways.
`TestHelloWorldSpringIntegrationCustomContext` loads a custom `test-spring-beans.xml` and the `TestGreeter`
`TestHelloWorldSpringTestRunner` uses the SpringJUnit4ClassRunner test runner instead of extending the Spring abstract test class

Another way to do this would be use Spring 'profiles' and have a test profile in your main xml. 
Personally I prefer to keep my test and production code separate.
