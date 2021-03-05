package com.ubs.app.dao;

import com.ubs.app.entities.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Transactional
public class StudentDaoImpl implements StudentDao{

    @Autowired
    LocalSessionFactoryBean sessionFactoryBean;

    @Autowired
    HibernateTransactionManager transactionManager;

    @Override
    public List<Student> getAllStudent() {
        Session session = sessionFactoryBean.getObject().openSession();
        return (List<Student>)session.createQuery("from STUDENT_TABLE").list();
    }

    @Override
    public void saveStudent(Student student) {
        Session session = sessionFactoryBean.getObject().openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.save(student);
        transaction.commit();
    }

    @Override
    public void deleteStudent(int id) {
        Session session = sessionFactoryBean.getObject().openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
/*        Query query = session.createQuery("DELETE STUDENT_TABLE WHERE studentId=:ID");
        query.setParameter("ID", id);
        query.executeUpdate();*/
         session.delete(getStudent(id));
        transaction.commit();
    }

    public Student getStudent(int id){
        Session  session = sessionFactoryBean.getObject().openSession();
        Student student = session.get(Student.class, id);
        return student;
    }

    @Override
    public void updateStudent(Student student) {
        Session session = sessionFactoryBean.getObject().openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.update(student);
        System.out.println("Received Student for Update: " + student.toString());
        transaction.commit();

    }
}
