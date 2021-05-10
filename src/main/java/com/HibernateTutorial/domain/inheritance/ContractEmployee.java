package com.HibernateTutorial.domain.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class ContractEmployee extends Employee {

    private Double payperhour;
    private Integer contractDura;

    public Double getPayperhour() {
        return payperhour;
    }

    public void setPayperhour(Double payperhour) {
        this.payperhour = payperhour;
    }

    public Integer getContractDura() {
        return contractDura;
    }

    public void setContractDura(Integer contractDura) {
        this.contractDura = contractDura;
    }
}
