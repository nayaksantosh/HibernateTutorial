package com.HibernateTutorial.dao;

import com.HibernateTutorial.domain.inheritance.ContEmployeeTablePerClass;
import com.HibernateTutorial.domain.inheritance.EmployeeTablePerClass;
import com.HibernateTutorial.domain.inheritance.RegulEployeeTablePerClass;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class EmployeeDao {

    @Autowired
    EntityManager entityManager;

    public void saveEmployee()
    {
        Session currentSesion = entityManager.unwrap(Session.class);
        Transaction tx = currentSesion.beginTransaction();

        ContEmployeeTablePerClass cem = new ContEmployeeTablePerClass();
        cem.setPayperhour(500.00);
        cem.setContractDura(3);
        cem.setEmpName("Sunil");
        cem.setPhonNo(89863544328L);
        currentSesion.save(cem);


        RegulEployeeTablePerClass rem = new RegulEployeeTablePerClass();
        rem.setSalary(3000000.00);
        rem.setBonus(600000);
        rem.setEmpName("Ravi");
        rem.setPhonNo(9543544328L);
        currentSesion.save(rem);

        RegulEployeeTablePerClass emp = new RegulEployeeTablePerClass();
        emp.setEmpName("Mohit");
        emp.setPhonNo(8983544328L);
        emp.setBonus(40000);
        emp.setSalary(400000.00);
        currentSesion.save(emp);
        tx.commit();
    }

    public EmployeeTablePerClass getEmployee(int id)
    {
        Session currentSesion = entityManager.unwrap(Session.class);
        RegulEployeeTablePerClass retObj = currentSesion.get(RegulEployeeTablePerClass.class,new Long(id));
        return retObj;
    }
}
