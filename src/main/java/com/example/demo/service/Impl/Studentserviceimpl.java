package com.example.demo.service.Impl;
import com.example.demo.service.Studentservice;
import com.example.demo.entity.Studententity;
import org.springframework.stereotype.Service;
@Service
public class Studentserviceimpl implements Studentservice{
@AutoWired Studentrepository student;
public Studententity postdata(Studententity entity){
    //findAll()
    //findById()

}
}