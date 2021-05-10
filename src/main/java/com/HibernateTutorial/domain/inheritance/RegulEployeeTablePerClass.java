package com.HibernateTutorial.domain.inheritance;

import javax.persistence.Entity;

@Entity
//@PrimaryKeyJoinColumn(name="RegEmploId")
public class RegulEployeeTablePerClass extends EmployeeTablePerClass{

    private Double salary;
    private Integer bonus;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }
}
