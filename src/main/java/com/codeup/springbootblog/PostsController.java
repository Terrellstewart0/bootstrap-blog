package com.codeup.springbootblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsController {


    @RequestMapping("/posts")
    @ResponseBody
    public String sayHello() {
        return "post index page";
    }

    @RequestMapping("/posts/{id}")
    @ResponseBody
    public String sayID(@PathVariable String id) {
        return "view an individual post " + id;
    }

    @RequestMapping ("/posts/create")
    @ResponseBody
    public String view() {
        return "view the form for creating a post";
    }

    @RequestMapping
    @ResponseBody
    public String create() {
        return "create a new post";
    }

}
