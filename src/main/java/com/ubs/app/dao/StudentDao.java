package com.ubs.app.dao;

import com.ubs.app.entities.Student;
import org.springframework.stereotype.Component;

import java.util.List;


public interface StudentDao {

    List<Student> getAllStudent();

    void saveStudent(Student student);

    void deleteStudent(int id);

    void updateStudent(Student student);


}
