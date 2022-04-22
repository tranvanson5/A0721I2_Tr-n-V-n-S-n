package com.example.demo.controller;

import com.example.demo.model.customer.Customer;
import com.example.demo.reponsitory.customer.CustomerReponsitory;
import com.example.demo.reponsitory.customer.CustomerTypeReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerReponsitory customerReponsitory;
    @Autowired
    private CustomerTypeReponsitory customerTypeReponsitory;
    @GetMapping("")
    public ModelAndView ShowCustomer(@PageableDefault(5)Pageable pageable){
        ModelAndView modelAndView= new ModelAndView("views/customer/list");
        modelAndView.addObject("customers",customerReponsitory.findAll(pageable));
        return modelAndView;
    }
    @GetMapping("create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("views/customer/create");
        modelAndView.addObject("customers", new Customer());
        modelAndView.addObject("customerType",customerTypeReponsitory.findAll());
        return modelAndView;
    }

    @PostMapping("save")
    public ModelAndView save(Customer customer) {
        ModelAndView modelAndView = new ModelAndView("redirect:/customer");
        customerReponsitory.save(customer);
        return modelAndView;
    }
    @GetMapping("{id}/edit")
    public ModelAndView ShowEdit(@PathVariable int id){
        ModelAndView modelAndView= new ModelAndView("views/customer/edit");
        Optional<Customer> customer= customerReponsitory.findById(id);
        modelAndView.addObject("customers",customer.get());
        modelAndView.addObject("customerType",customerTypeReponsitory.findAll());
        return modelAndView;
    }
    @PostMapping("update")
    public ModelAndView edit(Customer customer){
        ModelAndView modelAndView= new ModelAndView("redirect:/customer");
        customerReponsitory.save(customer);
        return modelAndView;
    }
    @GetMapping("{id}/delete")
    public  ModelAndView delete(@PathVariable int id){
        ModelAndView modelAndView= new ModelAndView("redirect:/customer");
        Optional<Customer> customer= customerReponsitory.findById(id);
        customerReponsitory.delete(customer.get());
        return modelAndView;
    }
}
