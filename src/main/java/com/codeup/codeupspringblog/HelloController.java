package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

record Message(String message){}

@Controller
public class HelloController {

    //Method will listen for GET requests at /hello
    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        return "<h1>Hello from Spring!</h1>";
    }
    //creates JSON response
    @GetMapping(path = "json", produces ="application/json")
    @ResponseBody
    public Message returnMessage(){
        return new Message("Hello from Spring*");
    }

    //RequestMapping
    @RequestMapping(path = "/color", method = RequestMethod.GET)
    @ResponseBody
    public String color() {
        return "Purple!";
    }

    @GetMapping("/hello/{firstname}/{lastName}")
    @ResponseBody
    public String sayHello(@PathVariable String firstname, @PathVariable String lastName) {
        return "<h1>Hello " + firstname + " " + lastName + "!</h1>";
    }
}
