package com.example.shopping_cart.controller;

import com.example.shopping_cart.model.Cart;
import com.example.shopping_cart.model.Product;
import com.example.shopping_cart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")

public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("shop");
        modelAndView.addObject("products", productRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("show")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }
    @GetMapping("/sub/{id}")
    public String subToCart(@PathVariable Long id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("show")) {
            cart.subProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.subProduct(productOptional.get());
        return "redirect:/shop";
    }
    @PostMapping("/saveCart")
    public ModelAndView saveCart( @ModelAttribute Cart cart){
        ModelAndView modelAndView=new ModelAndView("redirect:/shop");
        return modelAndView;
    }

}