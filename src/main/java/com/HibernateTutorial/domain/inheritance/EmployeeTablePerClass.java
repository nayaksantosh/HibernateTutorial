package com.HibernateTutorial.domain.inheritance;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class EmployeeTablePerClass {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long employeeID;

    private String empname;
    private Long phonno;

    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmpName() {
        return empname;
    }

    public void setEmpName(String empname) {
        this.empname = empname;
    }

    public Long getPhonNo() {
        return phonno;
    }

    public void setPhonNo(Long phonno) {
        this.phonno = phonno;
    }
}
