package com.example.demo.controller;
import  org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.Annotation.Autowired;
import com.example.demo.service.Studentservice;
import org.springframework.factory.Annotation.PostMapping;
import example.com.demo.entity.ValidationEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springwork.web.bind.annotation.PutMapping;
@Rest
public class Validationcontroller{
@Autowired Validationservice service;
@PostMapping("/validpost")
public ValidationEntity postval(@ Valid @RequestBody ValidationEntity entity){
    return service.postdata(entity);
}
@GetMapping("/validid{id}") 
public ValidationEntity getdataid(@PathVariable long id){
    return service.getData(id);
}

}