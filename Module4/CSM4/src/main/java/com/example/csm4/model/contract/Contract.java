package com.example.csm4.model.contract;

import com.example.csm4.model.customer.Customer;
import com.example.csm4.model.employee.Employee;
import com.example.csm4.model.service.Service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date contractStartDate;
    private Date contractEndDate;
    private Double contractDeposit;
    private Double contractTotalMoney;
    @OneToMany(mappedBy = "contract")
    Set<ContractDetail> contractDetailSet;
    @ManyToOne(targetEntity = Employee.class)
    private Employee employee;
    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;
    @ManyToOne(targetEntity = Service.class)
    private Service service;
}
