package com.example.demo.controller;
import  org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.Annotation.Autowired;
import com.example.demo.service.Studentservice;
import org.springframework.factory.Annotation.PostMapping;

@Rest
public class Validationcontroller{
@Autowired Validationservice service;
@PostMapping("/validpost")
public ValidationEntity postval(@ Valid @RequestBody ValidationEntity entity){
    return service.postdata(entity)
}

}