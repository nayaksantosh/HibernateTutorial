package com.HibernateTutorial.controller;

import com.HibernateTutorial.dao.ProjetDao;
import com.HibernateTutorial.domain.Project;
import com.HibernateTutorial.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
public class ProjectController {

    @Autowired
    ProjetDao projectDao;

    @GetMapping("/project")
    public List<Project> getProjectDetail()
      {
        //projectDao.getProject();
        System.out.println("Inside project Method");
        return projectDao.getProject();
      }


    @PostMapping("/project")
    public void saveStudent(@RequestBody Project proj )
    {
        projectDao.saveProject(proj);
    }



    @GetMapping("/student/{stId}")
    public @ResponseBody Student getProjectByID(@PathVariable("stId") int id)
    {
        System.out.println("Inside student Method=>"+id);
        return projectDao.getStudentById( id );
    }

    @PostMapping("/student")
    public void saveStudent(@RequestBody List<Student> std )
    {
        System.out.println("Inside controller class=>"+std.size());
        projectDao.saveStudent(std);
    }

    @PutMapping("/student")
    public void saveStudent(@RequestBody Student std )
    {
        System.out.println("Inside controller for put operation=>");
        projectDao.updateStudent(std);
    }
    @DeleteMapping("/student/{id}")
    public void saveStudent(@PathVariable("id") Integer std )
    {
        System.out.println("Inside controller for Delete operation=>");
        projectDao.deleteStudent(std);
    }
}
