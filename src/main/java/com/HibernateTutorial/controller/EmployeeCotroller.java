package com.HibernateTutorial.controller;

import com.HibernateTutorial.dao.EmployeeDao;
import com.HibernateTutorial.domain.inheritance.EmployeeTablePerClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeCotroller {

    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("/employee")
    public void saveEmployee( )
    {
        System.out.println("Inside save Employee");
            employeeDao.saveEmployee();
    }

    @GetMapping("/fetch/{Id}")
    public EmployeeTablePerClass getRegEmployee(@PathVariable("Id") int id)
    {
        System.out.println("Inside get Employee");
        return employeeDao.getEmployee(id);
    }
}
