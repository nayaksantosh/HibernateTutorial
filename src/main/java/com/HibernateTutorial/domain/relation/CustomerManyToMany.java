package com.HibernateTutorial.domain.relation;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerManyToMany {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Integer cusid;

    @Column(name="cusname")
    private String cusname;

    @Column(name="proid")
    private Integer proID;

    @ManyToMany(cascade=CascadeType.ALL)
    List<ProductManyToMany> productManyToMany;

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
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

    public List<ProductManyToMany> getProduct() {
        return productManyToMany;
    }

    public void setProduct(List<ProductManyToMany> productManyToMany) {
        this.productManyToMany = productManyToMany;
    }
}
