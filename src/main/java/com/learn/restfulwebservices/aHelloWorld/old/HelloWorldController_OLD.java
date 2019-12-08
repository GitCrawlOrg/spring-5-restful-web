package com.learn.restfulwebservices.aHelloWorld.old;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController_OLD {
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "My Name is Nitin";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping("/hello-world-pathVar/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("My Name is %s", name));
	}
}