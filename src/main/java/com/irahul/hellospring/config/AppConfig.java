package com.irahul.hellospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.irahul.hellospring.Greeter;
import com.irahul.hellospring.HelloWorldSpring;
import com.irahul.hellospring.impl.EnglishGreeter;
import com.irahul.hellospring.impl.HindiGreeter;

/**
 * Config in java instead of XML
 * Equivalent to spring-beans.xml
 * @author rahul
 *
 */
@Configuration
public class AppConfig {

	@Bean(name="greeterHindi")
	public Greeter getHindiGreeter(){
		return new HindiGreeter();
	}
	
	@Bean(name="greeterEnglish")
	public Greeter getEnglishGreeter(){
		return new EnglishGreeter();
	}
	
	@Bean(name="helloWorld")
	public HelloWorldSpring helloSpring(){
		HelloWorldSpring hws = new HelloWorldSpring();
		hws.setGreeter(getHindiGreeter());
		return hws;
	}
	
}
