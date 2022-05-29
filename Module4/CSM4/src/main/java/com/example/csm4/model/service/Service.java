package com.example.csm4.model.service;

import com.example.csm4.model.contract.Contract;
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
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceId;
    private String serviceName;
    private int serviceArea;
    private Double serviceCost;
    private int serviceMaxPeople;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private Double pool_area;
    private int numberOfFloors;
    @ManyToOne(targetEntity = ServiceType.class)
    private ServiceType serviceType;
    @ManyToOne(targetEntity = RentType.class)
    private RentType rentType;
    @OneToMany(mappedBy = "service")
    Set<Contract> contractSet;
}
