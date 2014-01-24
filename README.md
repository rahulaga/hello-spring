#Hello Spring

Copyright (C) 2014 Rahul Agarwal

Sample bean wirings using Spring (4.x) and corresponding JUnit tests

HelloWorld becomes multi-lingual here and based on a specific language Greeter implementation it saysHello.

`HelloWorld` and `TestHelloWorld`: 
"Traditional" way without Spring

`HelloWorldSpring` is a simple POJO - not Spring annotations or dependencies
`spring-beans.xml` defines the Spring beans

`TestHelloWorldSpring`, `TestHelloWorldSpringIntegration` load the above context in two different ways.
`TestHelloWorldSpringIntegrationCustomContext` loads a custom `test-spring-beans.xml` and the `TestGreeter`

Another way to do this would be use Sping 'profiles' and have a test profile in your main xml. 
Personally I prefer to keep my test and production code separate.

`AppConfig` and `TestAppConfig` show the use of annotations instead of XML
