package com.ubs.app.service;

import com.ubs.app.dao.StudentDao;
import com.ubs.app.dao.StudentDaoImpl;
import com.ubs.app.dao.StudentDaoImplV1;
import com.ubs.app.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDaoImpl studentDao;

    @Autowired
    StudentDaoImplV1 studentDaoImplV1;

    @Transactional
    public List<Student> getAllStudents(){
        return studentDao.getAllStudent();
    }

    @Transactional
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
        System.out.println("Saved Student: " + student.toString());
    }

    @Transactional
    public void deleteStudent(int id){
        studentDao.deleteStudent(id);
        System.out.println("Deleted student: " + id);
    }

    @Transactional
    public void updateStudent(Student student){
        studentDao.updateStudent(student);
        System.out.println("updated Student: " + student.toString());
    }


    public Student findByID(int id){
       return studentDaoImplV1.findbyId(id);
    }

    public void insertOrupdateStudent(Student student){
        studentDaoImplV1.insertAndUpdateStudent(student);
    }

}
