package org.example.service;

import org.example.Student;
import org.example.dao.StudentDAO;

import java.util.Objects;
import java.util.Optional;

public class StudentService {
    StudentDAO dao = new StudentDAO();
    public void processStudentById(int id){
        Optional<Student> optionalStudent = dao.getStudentById(id);

        optionalStudent.ifPresent(s -> System.out.println(s.getFirstName()));
        optionalStudent.orElseGet(() -> Student.builder().build());
        optionalStudent.orElseThrow(() -> new RuntimeException("id: " + id + " is not available in databse"));


        if(optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            if("Divyanshu".equalsIgnoreCase(student.getFirstName()))
            System.out.println(student.getFirstName());
        }

    }
}
