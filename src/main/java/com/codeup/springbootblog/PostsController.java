package com.codeup.springbootblog;

import com.codeup.springbootblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class PostsController {


    @RequestMapping("/posts")
    public String index(Model viewAndModel) {
        List<Post> posts = Arrays.asList(
                new Post("Post A", "Body A"),
                new Post("Post B", "Body B"),
                new Post("Post C", "Body C")
        );

        viewAndModel.addAttribute("posts", posts);

        return "posts/index";
    }

    @RequestMapping("/posts/{id}")
    public String show(@PathVariable long id, Model viewAndModel) {
        Post post = new Post("Test post", "Test body");

                viewAndModel.addAttribute("post", post);

                 return "posts/show";
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
