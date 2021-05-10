package com.HibernateTutorial.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Student implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rollNO")
    private int rollNO;


    private String standard;

    private String sname;

    private Date dateofjoin;

    private Date dateofleaving;




    public Date getDateOfJoin() {
        return dateofjoin;
    }

    public void setDateOfJoin(Date dateofjoin) {
        this.dateofjoin = dateofjoin;
    }

    public Date getDateOfLeaving() {
        return dateofleaving;
    }

    public void setDateOfLeaving(Date dateofleaving) {
        this.dateofleaving = dateofleaving;
    }

    public String getsName() {
        return sname;
    }

    public void setsName(String sname) {
        this.sname = sname;
    }

    public int getRollNo() {
        return rollNO;
    }

    public void setRollNo(int rollNo) {
        this.rollNO = rollNo;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
