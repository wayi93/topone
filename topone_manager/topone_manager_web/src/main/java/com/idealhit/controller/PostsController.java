package com.idealhit.controller;

import com.idealhit.pojo.Posts;
import com.idealhit.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsController {

    @Autowired
    PostsService postsService;

    @RequestMapping("/post/{id}")
    @ResponseBody
    public Posts getPostById(@PathVariable Integer id){
        return postsService.getPostById(id);
    }

}
