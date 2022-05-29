package com.example.blog.api;

import com.example.blog.model.Blog;
import com.example.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;

@RestController
public class ApiBlogController {
    @Autowired
    private IBlogRepository iBlogRepository;
    @GetMapping("/api/blog")
    public ResponseEntity<Iterable<Blog>> Index(){
        List<Blog> blogs= iBlogRepository.findAll();
        if (blogs.isEmpty()){
            return new ResponseEntity<>(blogs,HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
}
