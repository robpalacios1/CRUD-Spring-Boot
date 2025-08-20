package com.springboot.crud.entity;

//import org.springframework.aot.generate.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_student")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long studentId;
  private String firstName;
  private String lastName;
  @Column(name = "email_address", unique = true, nullable = false)
  private String email;
}
