package com.HibernateTutorial.domain.relation;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Integer cusid;

    @Column(name="cusname")
    private String cusname;

    @Column(name="proid")
    private Integer proID;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="product_id")
    Product product;

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getCusid() {
        return cusid;
    }

    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }


    public Integer getProID() {
        return proID;
    }

    public void setProID(Integer proID) {
        this.proID = proID;
    }
}
