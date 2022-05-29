package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
    @Autowired
    private BlogRepository blogRepository;
    @GetMapping("")
    public ResponseEntity<Iterable<Blog>> showAllBlog(){
        List<Blog> blogs= blogRepository.findAll();
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
}
