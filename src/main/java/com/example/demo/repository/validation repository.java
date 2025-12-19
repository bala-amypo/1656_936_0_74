package com.example.demo.service.impl;
import com.example.demo.service.Timestampservice;
import org.springframework.stereotype.service;
import com.example.demo.repository.Timestamprepository;
import com.example.demo.entity.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class Timestqampserviceimpl implements{
    @Autowired Timestamprepository student;
    @override
    public Timestamprepository posttime(Timestamp){
        return student.save(stu);
    }
}