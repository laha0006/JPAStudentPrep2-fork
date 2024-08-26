package com.example.jpastudentprep2.repositories;

import com.example.jpastudentprep2.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testOneBruce(){
        List<Student> students = studentRepository.findByName("Bruce");
        assertEquals(1, students.size());
    }

    @Test
    void testOneViggo(){
        Student student = new Student(
                "Viggo",
                LocalDate.of(2021, 9, 7),
                LocalTime.of(7, 58, 10)
        );
        studentRepository.save(student);
        List<Student> students = studentRepository.findByName("Viggo");
        assertEquals(1, students.size());
    }
}