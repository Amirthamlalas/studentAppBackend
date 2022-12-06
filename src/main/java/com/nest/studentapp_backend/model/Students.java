package com.nest.studentapp_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Students {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String admno;
    private int rollno;
    private String college;
}
