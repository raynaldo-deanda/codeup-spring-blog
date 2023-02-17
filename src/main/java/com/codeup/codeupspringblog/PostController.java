package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String postPage(){
        return "Post Index page... ";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postId(@PathVariable int id){
        return "Post page for id: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String getCreateForm(){
        return "Post page w/ post create form.";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String postCreateSubmit(){
        return "Post page after creating a post.";
    }

    }
