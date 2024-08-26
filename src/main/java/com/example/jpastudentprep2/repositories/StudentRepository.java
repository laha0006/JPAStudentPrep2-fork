package com.example.jpastudentprep2.repositories;

import com.example.jpastudentprep2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByName(String string);
}
