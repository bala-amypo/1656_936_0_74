package com.example.demo.service.Impl;
import com.example.demo.service.Studentservice;
import com.example.demo.entity.Studententity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.Annotation.AutoWired;
import com.example.demo.repository.Studentrepository;
import java.util.List;
@Service
public class Studentserviceimpl implements Studentservice{
@Autowired Studentrepository student;
@Override

public Studententity postdata(Studententity entity){
    //findAll()
    //findById()
    //deleteById()
    //save()
    //existsById()
    return student.save(student);

}
@override
public List<Studententity>getAllData(){
    return student.findAll();
}
public Studententity
}
