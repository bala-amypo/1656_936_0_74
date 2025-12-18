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
    return service.Postdata(entity);                                                                                                                service.getAllData();
    
}
@GetMapping("/get")
public List<Studententity>getAll(){
    return service.getAllData();
}

@DeleteMapping("/del/id")
public String DeleteData(@PathVariable int id){
    return service.DeleteData(id);
}
@GetMapping("/getid/{id}")
public studententity getdataid(@pathVariable int id){
    return service.getData
}

@PutMapping("/put/id")
public Studententity putval(@Pathvariable int id,)

}