package com.example.csm4.model.contract;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int attachServiceId;
    private String attachServiceName;
    private Double attachServiceCost;
    private int attachServiceUnit;
    private String attachServiceStatus;
    @OneToMany(mappedBy = "attachService")
    Set<ContractDetail> contractDetailSetter;
}
