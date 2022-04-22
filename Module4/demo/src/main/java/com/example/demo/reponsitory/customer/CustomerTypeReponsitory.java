package com.example.demo.reponsitory.customer;

import com.example.demo.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTypeReponsitory extends JpaRepository<CustomerType,Integer> {

}
