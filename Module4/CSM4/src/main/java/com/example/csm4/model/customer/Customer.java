package com.example.csm4.model.customer;

import com.example.csm4.model.contract.Contract;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    private int customerId;
    private String customerName;
    private Date customerBirthday;
    private int customerGender;
    private String customerIdCard;
    private String customerPhone;
    private String customerEmail;
    private String customerAddress;
    @ManyToOne(targetEntity = CustomerType.class)
    private CustomerType customerType;
    @OneToMany(mappedBy = "customer")
    Set<Contract> contractSet;
}
