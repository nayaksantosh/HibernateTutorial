package com.HibernateTutorial.domain.relation;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class ProductManyToMany {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer proId;

    @Column(name="proname")
    private String proName;

    @Column(name="consid")
    private Integer consID;

  /*  @ManyToMany
    List<CustomerManyToMany> customerManyToMany;

    public List<CustomerManyToMany> getCustomerManyToMany() {
        return customerManyToMany;
    }

    public void setCustomerManyToMany(List<CustomerManyToMany> customerManyToMany) {
        this.customerManyToMany = customerManyToMany;
    }*/

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductManyToMany)) return false;
        ProductManyToMany that = (ProductManyToMany) o;
        return getProId().equals(that.getProId()) && getProName().equals(that.getProName()) && getConsID().equals(that.getConsID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProId(), getProName(), getConsID());
    }
}
