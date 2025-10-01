package org.example.dao;

import org.example.Student;

import java.util.Optional;

public class StudentDAO {
    public Optional<Student> getStudentById(int id){
        // fire select query
        Student student = null;
        Optional<Student> optionalStudent = Optional.ofNullable(student);
        return optionalStudent;
    }
}
