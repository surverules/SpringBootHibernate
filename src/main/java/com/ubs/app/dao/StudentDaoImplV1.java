package com.ubs.app.dao;

import com.ubs.app.entities.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Component
@Transactional
public class StudentDaoImplV1 {

    @Autowired
    EntityManager entityManager;

    public Student findbyId(int id) {
        return entityManager.find(Student.class, 1);
    }

    public void insertAndUpdateStudent(Student student){
        entityManager.merge(student);
    }



}
