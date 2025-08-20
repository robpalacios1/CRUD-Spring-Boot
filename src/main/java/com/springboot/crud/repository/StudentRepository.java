package com.springboot.crud.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.crud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Additional query methods can be defined here if needed
}
