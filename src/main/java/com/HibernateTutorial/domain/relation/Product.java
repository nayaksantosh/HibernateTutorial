package com.HibernateTutorial.domain.relation;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer proId;

    @Column(name="proname")
    private String proName;

    @Column(name="consid")
    private Integer consID;

    @OneToOne(mappedBy = "product")
    Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Integer getConsID() {
        return consID;
    }

    public void setConsID(Integer consID) {
        this.consID = consID;
    }
}
