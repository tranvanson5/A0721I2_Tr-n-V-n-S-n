package com.example.demo.reponsitory.customer;

import com.example.demo.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReponsitory extends JpaRepository<Customer,Integer> {
}
