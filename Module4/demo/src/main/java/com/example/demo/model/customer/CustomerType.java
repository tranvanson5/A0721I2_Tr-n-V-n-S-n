package com.example.demo.model.customer;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "customer_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_type_id;
    @NotNull
    private String customer_type_name;
    @OneToMany(mappedBy = "customer_id")
    Set<Customer> customers;

    public CustomerType() {
    }

    public CustomerType(int customer_type_id, String customer_type_name, Set<Customer> customers) {
        this.customer_type_id = customer_type_id;
        this.customer_type_name = customer_type_name;
        this.customers = customers;
    }

    public CustomerType(int customer_type_id, String customer_type_name) {
        this.customer_type_id = customer_type_id;
        this.customer_type_name = customer_type_name;
    }

    public int getCustomer_type_id() {
        return customer_type_id;
    }

    public void setCustomer_type_id(int customer_type_id) {
        this.customer_type_id = customer_type_id;
    }

    public String getCustomer_type_name() {
        return customer_type_name;
    }

    public void setCustomer_type_name(String customer_type_name) {
        this.customer_type_name = customer_type_name;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
