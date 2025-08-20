package com.springboot.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.crud.entity.Student;
import com.springboot.crud.service.StudentService;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

  @Autowired
  private StudentService studentService;

  @GetMapping
  public List<Student> getAll() {
    return studentService.getStudents();
  }

  @PostMapping
  public void saveUpdate(@RequestBody Student student) {
    studentService.saveOrUpdate(student);
  }
}
