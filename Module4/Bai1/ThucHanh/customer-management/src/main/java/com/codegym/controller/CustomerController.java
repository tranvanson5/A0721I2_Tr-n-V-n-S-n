package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.ICustomerService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class CustomerController {
    private ICustomerService service=new CustomerService();
    @GetMapping()
    public ModelAndView showCustomer(){
        ModelAndView modelAndView= new ModelAndView("index");
        modelAndView.addObject("list",service.findALl());
        return  modelAndView;
    }
    @GetMapping("create")
    public ModelAndView createCustomer(){
        ModelAndView modelAndView= new ModelAndView("create");
        Customer customer= new Customer();
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }
    @PostMapping("save")
    public ModelAndView save(Customer customer){
        ModelAndView modelAndView=new ModelAndView("redirect:/");
        int id= service.findALl().size()+1;
        customer.setId(id);
        service.save(customer);
        return modelAndView;
    }
    @GetMapping("{id}/edit")
    public ModelAndView edit(@PathVariable int id){
        ModelAndView modelAndView= new ModelAndView("edit");
        Customer customer= new Customer();
        modelAndView.addObject("customer",);
        return modelAndView;
    }
    @PostMapping("/save")
    public ModelAndView saveUpdate(Customer customer){
        ModelAndView modelAndView=new ModelAndView("redirect:/");
        service.save(customer);
        return modelAndView;
    }
}
