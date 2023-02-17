package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("/posts/create}")
    @ResponseBody
    public String postCreateForm(){
        return "Post page w/ post create form.";
    }

    @PostMapping("/posts/create}")
    @ResponseBody
    public String postCreateSubmit(){
        return "Post page after creating a post.";
    }

    }
