package com.example.csm4.model.employee;

import com.example.csm4.model.contract.Contract;
import com.example.csm4.model.employee.role.User;
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
public class Employee {
    @Id
    @GeneratedValue
    private int employeeId;
    private String employeeName;
    private Date employeeBirthay;
    private String employeeIdCard;
    private Double employeeSalary;
    private String employeePhone;
    private String employeeEmail;
    private String employeeAddress;
    @ManyToOne(targetEntity = Position.class)
    private Position positions;
    @ManyToOne(targetEntity = EducationDegree.class)
    private EducationDegree educationDegree;
    @ManyToOne(targetEntity = Division.class)
    private Division division;
    @OneToMany(mappedBy = "employee")
    Set<Contract> contracts;
    @ManyToOne(targetEntity = User.class)
    private User user;
}
