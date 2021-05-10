package com.HibernateTutorial.domain;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import java.util.Date;


@Entity
@Table
public class Project {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int pnumber;

    private String pname;
    private String plocation;
    private int dnum;
    private Date dateOfStart;
    private Date dateofEnd;


    
    public Date getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(Date dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public Date getDateofEnd() {
        return dateofEnd;
    }

    public void setDateofEnd(Date dateofEnd) {
        this.dateofEnd = dateofEnd;
    }

    public String getPlocation() {
        return plocation;
    }

    public void setPlocation(String plocation) {
        this.plocation = plocation;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPnumber() {
        return pnumber;
    }


    public void setPnumber(int pnumber) {
        this.pnumber = pnumber;
    }

    public int getDnum() {
        return dnum;
    }

    public void setDnum(int dnum) {
        this.dnum = dnum;
    }
}
