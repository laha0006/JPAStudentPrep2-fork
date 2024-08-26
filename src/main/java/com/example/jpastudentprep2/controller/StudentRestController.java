package com.example.jpastudentprep2.controller;

import com.example.jpastudentprep2.model.Student;
import com.example.jpastudentprep2.repositories.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
public class StudentRestController {

    private final StudentRepository studentRepository;

    public StudentRestController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public List<Student> students() {
        return studentRepository.findAll();
    }

    @GetMapping("/addstudent")
    public List<Student> addstudent() {
        Student student = new Student();
        student.setBornDate(LocalDate.now());
        student.setBornTime(LocalTime.now());
        student.setName("Add");
        studentRepository.save(student);

        return studentRepository.findAll();

    }
}
