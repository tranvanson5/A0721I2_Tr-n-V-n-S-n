package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.BlogForm;
import com.codegym.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

@Controller
@RequestMapping
public class BlogController {
    @Autowired
    private BlogRepository repository;
    @GetMapping("")
    public ModelAndView view(){
        return new ModelAndView("views/list", "lists",repository.findAll());
    }
    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView= new ModelAndView("views/create");
        modelAndView.addObject("blogForm",new BlogForm());
        return modelAndView;
    }
    @PostMapping("/save")
    public ModelAndView create(@ModelAttribute BlogForm blogForm){
        MultipartFile multipartFile=blogForm.getFile();
        String fileName= multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(blogForm.getFile().getBytes(), new File("D:\\file\\"+fileName));
        }catch (Exception ex){
            System.out.println(ex);
        }
        Blog blog= new Blog(blogForm.getId(),blogForm.getName(),blogForm.getContent(),fileName);
        repository.save(blog);
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        modelAndView.addObject("blogForm",blogForm);
        return modelAndView;
    }
}
