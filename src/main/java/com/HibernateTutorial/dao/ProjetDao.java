package com.HibernateTutorial.dao;

import com.HibernateTutorial.domain.Project;
import com.HibernateTutorial.domain.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;

@Repository
public class ProjetDao {

    @Autowired
    private EntityManager entityManager;



    public List<Project> getProject() {
        Session currentSesion = entityManager.unwrap(Session.class);
        Query<Project> query = currentSesion.createQuery("from Project",Project.class);
         List<Project> list = query.getResultList();
         return list;
    }

    public void saveProject(Project proj){

        Session currentSesion = entityManager.unwrap(Session.class);
        Transaction tx =currentSesion.beginTransaction();
        currentSesion.save(proj);
        tx.commit();
    }



    public Student getStudentById(int id) {
        Session currentSesion = entityManager.unwrap(Session.class);
        Transaction tx =currentSesion.beginTransaction();
        Student st = (Student) currentSesion.get(Student.class,new Integer(id));
        tx.commit();
        return st;
    }

    public void  saveStudent(List<Student> std){
        Session currentSesion = entityManager.unwrap(Session.class);
        Transaction tx =currentSesion.beginTransaction();
         for(Student st : std){
             st.setDateOfJoin(new Date());
        Integer no = (Integer)currentSesion.save(st);
        System.out.println("Data is saved with ID =>"+no);
         }
        tx.commit();
       // currentSesion.save(st1);
    }
    public void  updateStudent(Student st){
        Session currentSesion = entityManager.unwrap(Session.class);
        Transaction tx =currentSesion.beginTransaction();
            currentSesion.update(st);
        tx.commit();
    }

    public void  deleteStudent(Integer st){
        Session currentSesion = entityManager.unwrap(Session.class);
        Transaction tx =currentSesion.beginTransaction();
        Student st1 = (Student)currentSesion.get(Student.class,st);
        currentSesion.delete(st1);
        tx.commit();
    }


}
