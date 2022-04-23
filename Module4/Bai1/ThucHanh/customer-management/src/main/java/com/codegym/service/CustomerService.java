package com.codegym.service;

import com.codegym.model.Customer;

import java.util.*;

public class CustomerService implements ICustomerService{
    private static Map<Integer,Customer> map= new HashMap<>();
    static {
        map.put(1,new Customer(1,"son1","son1@gmail.com","QuangNam"));
        map.put(2,new Customer(2,"son2","son2@gmail.com","QuangNam1"));
        map.put(3,new Customer(3,"son3","son3@gmail.com","QuangNam2"));
        map.put(4,new Customer(4,"son4","son4@gmail.com","QuangNam3"));

    }

    @Override
    public List<Customer> findALl() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Customer findById(int id) {
        return map.get(id);
    }

    @Override
    public void save(Customer customer) {
        map.put(customer.getId(), customer);
    }

    @Override
    public void delete(int id) {
        map.remove(id);
    }
}
