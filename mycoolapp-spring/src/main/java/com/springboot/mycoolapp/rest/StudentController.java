package com.springboot.mycoolapp.rest;


import com.springboot.mycoolapp.model.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    List<Student> theStudents;


    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();

        theStudents.add(new Student(1,"Rohan",25));
        theStudents.add(new Student(2,"Aman",21));
        theStudents.add(new Student(3,"Vikey",27));

    }

    @GetMapping("/students")
    public  List<Student> getStudents(){
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if((studentId >= theStudents.size()) || (studentId < 0)){
            throw new StudentNotFoundException("Student id Not found - " + studentId);
        }
        return theStudents.get(studentId);
    }
}
