package com.example.demo.serviceImpl;
import com.example.demo.service.Timestampservice;
import org.springframework.demo.service.TimeStampservice;
import org.springframework.stereotype.repository.service;
import com.example.repository.Timestamprepository;
import com.example.demo.entity.Timestamp;
import org.springframe.beans.factory.annotation.Autowired;

@Service
public class Timestampserviceimpl implements Timestampservice{
    @Autowired TimeStamprepository student;
    @override
    public Timestamp posttime (Timestamp stu){
        return student.save(stu);
    }
    
}