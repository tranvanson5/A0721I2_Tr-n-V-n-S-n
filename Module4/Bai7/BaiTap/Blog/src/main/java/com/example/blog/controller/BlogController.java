package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.repository.IBlogRepository;
import com.example.blog.repository.ICategoryRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private IBlogRepository iBlogRepository;
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @GetMapping("")
    public ModelAndView Index(@RequestParam("search") Optional<String> search, @PageableDefault(5) Pageable pageable){
        Page<Blog> blogPage;
        if(search.isPresent()){

            blogPage=iBlogRepository.searchAllByAuthor(search.get(),pageable);
        }else{
            blogPage = iBlogRepository.findAll(pageable);
        }
        ModelAndView modelAndView= new ModelAndView("blog/index");
        modelAndView.addObject("lists",blogPage);
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView Create(){
        ModelAndView modelAndView= new ModelAndView("blog/create");
        modelAndView.addObject("object",new Blog());
        modelAndView.addObject("listsCategory",iCategoryRepository.findAll());
        return modelAndView;
    }
    @PostMapping("/create")
    public  ModelAndView SaveCreate(Blog blog){
        iBlogRepository.save(blog);
        ModelAndView modelAndView= new ModelAndView("redirect:/");
        return modelAndView;
    }
    @GetMapping("/update/{id}")
    public ModelAndView upadate(@PathVariable("id") int id){
        ModelAndView modelAndView= new ModelAndView("blog/update");
        modelAndView.addObject("object",iBlogRepository.findById(id));
        modelAndView.addObject("listsCategory",iCategoryRepository.findAll());
        return modelAndView;
    }
    @PostMapping("/update")
    public  ModelAndView SaveUpdate(Blog blog){
        iBlogRepository.save(blog);
        ModelAndView modelAndView= new ModelAndView("redirect:/");
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") int id){
        iBlogRepository.deleteById(id);
        ModelAndView modelAndView= new ModelAndView("redirect:/");
        return modelAndView;
    }
    @GetMapping("/view/{id}")
    public ModelAndView showView(@PathVariable("id") int id){
        ModelAndView modelAndView= new ModelAndView("blog/view");
        modelAndView.addObject("object",iBlogRepository.getById(id));
        return modelAndView;
    }
}
