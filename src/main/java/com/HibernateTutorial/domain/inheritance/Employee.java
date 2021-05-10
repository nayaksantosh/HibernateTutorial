package com.HibernateTutorial.domain.inheritance;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="employeeType")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long employeeID;

    private String empName;
    private Long phonNo;

    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Long getPhonNo() {
        return phonNo;
    }

    public void setPhonNo(Long phonNo) {
        this.phonNo = phonNo;
    }
}
