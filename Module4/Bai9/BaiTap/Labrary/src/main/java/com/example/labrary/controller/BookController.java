package com.example.labrary.controller;

import com.example.labrary.model.Book;
import com.example.labrary.model.BookDetail;
import com.example.labrary.repository.BookDetailRepository;
import com.example.labrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookDetailRepository detailRepository;
    @GetMapping("/")
    public ModelAndView  showView(){
        ModelAndView modelAndView= new ModelAndView("views/index");
        modelAndView.addObject("lists",bookRepository.findAll());
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView= new ModelAndView("views/create");
        modelAndView.addObject("book",new Book());
        modelAndView.addObject("bookDetail", new BookDetail());
        return modelAndView;
    }
    @PostMapping("/save")
    public ModelAndView create(@ModelAttribute("book") Book book,@ModelAttribute("bookDetail") BookDetail bookDetail){
        bookRepository.save(book);
        detailRepository.save(bookDetail);
        ModelAndView modelAndView= new ModelAndView("redirect:/");
        return modelAndView;
    }
}
