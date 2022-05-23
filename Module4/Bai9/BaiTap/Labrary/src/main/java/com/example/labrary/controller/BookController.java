package com.example.labrary.controller;

import com.example.labrary.repository.BookDetailRepository;
import com.example.labrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookDetailRepository detailRepository;
    @GetMapping("/")
    public  String showView(@RequestParam ("search") Optional<String> search, @PageableDefault(5)Pageable pageable, Model model){
        if(search.isPresent()){
            model.addAttribute("lists", bookRepository.searchAllByNameContaining(search.get().trim(),pageable));
        }else {
            model.addAttribute("lists",bookRepository.findAll(pageable));
        }
        return "views/index";
    }

}
