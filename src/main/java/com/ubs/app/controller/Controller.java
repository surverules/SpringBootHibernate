package com.ubs.app.controller;


import com.ubs.app.entities.Student;
import com.ubs.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    StudentService studentService;


    public String sayHello(){
        return "hello World";
    }

    @GetMapping("/students")
    public List<Student> allStudents(){
        ArrayList<Student> allstudents = new ArrayList<Student>();
        for (Student student: allstudents){
            System.out.println(student);
        }

        return studentService.getAllStudents();
    }

    @PostMapping ("/students/addstudent")
    public void addstudent(@RequestBody Student student){
        System.out.println("Object Received: " + student.toString());
        studentService.saveStudent(student);
    }

    @PutMapping("/students/updstudent")
    public void updateStudent(@RequestBody Student student){
        System.out.println("Student to update received: " + student);
        studentService.updateStudent(student);
    }

    @DeleteMapping("/students/delstudent")
    public void deleteStudent(@RequestParam(name = "ID") String id){
        System.out.println("Student for deleting purpose: " + id);
        studentService.deleteStudent(Integer.parseInt(id));
    }

    @GetMapping("students/findstudent/{id}")
    public Student findbyId(@PathVariable int id){
        return studentService.findByID(id);
    }

    @PostMapping("students/insupdstudent")
    public void insertorupdateStudent(@RequestBody Student student){
        studentService.insertOrupdateStudent(student);
    }
}
