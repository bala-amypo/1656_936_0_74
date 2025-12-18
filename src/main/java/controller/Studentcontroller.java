package com.example.demo.controller;
import  org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.Annotation.Autowired;
import com.example.demo.service.Studentservice;
import org.springframework.factory.Annotation.PostMapping;


@RestController


public class Studentcontroller{
    @Autowired Studentservice ser;
    @PostMapping("/post")
    public Studententity postval(@RequestBody StudentEntity entity){
        return service.postdata(stu);
    }
    @GetMapping("/get")
public List<StudentEntity>getval(){
    return service                                                                                                                service.getAllData();
    
}
@PutMapping("/put/id")
public Studententity putval(@Pathvariable int id,)

}