package com.example.csm4.model.contract;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractDetailId;
    private int quantity;
    @ManyToOne(targetEntity = Contract.class)
    @JoinColumn(name = "contract_id")
    private Contract contract;
    @ManyToOne(targetEntity = AttachService.class)
    @JoinColumn(name = "attachServiceId")
    private AttachService attachService;
}
