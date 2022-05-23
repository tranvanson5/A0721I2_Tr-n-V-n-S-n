package com.example.csm4.model.employee;

import com.example.csm4.model.customer.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Position {
    @Id
    @GeneratedValue
    private int positionId;
    private String positionName;
    @OneToMany(mappedBy = "employeeId")
    Set<Employee> employees;

}
