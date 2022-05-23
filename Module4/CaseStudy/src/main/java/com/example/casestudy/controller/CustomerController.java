package com.example.casestudy.controller;

import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.repository.ICustomerRepository;
import com.example.casestudy.repository.ICustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerRepository customerRepository;
    @Autowired
    public ICustomerTypeRepository customerTypeRepository;
    @GetMapping("")
    public ModelAndView showList(@PageableDefault(5)Pageable pageable){
        ModelAndView modelAndView= new ModelAndView("views/customer/list");
        modelAndView.addObject("lists",customerRepository.findAll(pageable));
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView= new ModelAndView("views/customer/create");
        modelAndView.addObject("customer",new Customer());
        modelAndView.addObject("customerTypes",customerTypeRepository.findAll());
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView Create(Customer customer){
        customerRepository.save(customer);
        ModelAndView modelAndView= new ModelAndView("redirect:/customer");
        return modelAndView;
    }
}
