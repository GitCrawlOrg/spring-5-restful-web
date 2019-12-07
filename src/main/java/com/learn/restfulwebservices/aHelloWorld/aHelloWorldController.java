package com.learn.restfulwebservices.aHelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nichaurasia on Saturday, December/07/2019 at 3:00 PM
 */
@RestController
@RequestMapping("/api/v0/hello-world")
public class aHelloWorldController {

    @RequestMapping(method= RequestMethod.GET,path="/requestMapping")
    public String helloWorldViaRequestMapping() {
        return "Hello World - From requestMapping";
    }

}
