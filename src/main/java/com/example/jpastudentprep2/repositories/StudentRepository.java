package com.example.jpastudentprep2.repositories;

import com.example.jpastudentprep2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
