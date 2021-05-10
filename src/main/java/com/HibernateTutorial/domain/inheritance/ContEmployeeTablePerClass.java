package com.HibernateTutorial.domain.inheritance;

import javax.persistence.Entity;

@Entity
//@PrimaryKeyJoinColumn(name="ContEmploID")
public class ContEmployeeTablePerClass extends EmployeeTablePerClass {

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
