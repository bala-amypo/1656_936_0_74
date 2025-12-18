package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
@Entity
public class Studententity{
    @Id
    @GeneratedValue
private String Name;
private Integer id;
private String email;
private String password;
private Date createdat;
public Studententity(){}





}