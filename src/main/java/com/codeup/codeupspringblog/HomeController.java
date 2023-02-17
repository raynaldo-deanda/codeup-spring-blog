package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    //Method will listen for GET requests at /hello
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "This is the landing page!";
    }
}
