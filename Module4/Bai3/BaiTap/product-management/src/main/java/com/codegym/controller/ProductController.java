package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import com.codegym.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    private IProductService service=new ProductService();
    @GetMapping("")
    public ModelAndView show(){
        ModelAndView modelAndView= new ModelAndView("index");
        modelAndView.addObject("products",service.findAll());
        return modelAndView;
    }
    @GetMapping("/create")
    public  ModelAndView showCreate(){
        ModelAndView modelAndView= new ModelAndView("create");
        modelAndView.addObject("product",new Product());
        return modelAndView;
    }
    @PostMapping("/save")
    public ModelAndView create(Product product){
        service.save(product);
        ModelAndView modelAndView= new ModelAndView("redirect:/");
        return modelAndView;
    }
    @GetMapping("{id}/update")
    public  ModelAndView showEdit(@PathVariable("id") int id){
        ModelAndView modelAndView= new ModelAndView("edit");
        modelAndView.addObject("product",service.findById(id));
        return modelAndView;
    }
    @GetMapping("{id}/delete")
    public  ModelAndView delete(@PathVariable("id") int id){
        service.remove(id);
        ModelAndView modelAndView= new ModelAndView("redirect:/");
        return modelAndView;
    }
}
