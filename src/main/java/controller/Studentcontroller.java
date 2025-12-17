package com.example.demo.controller;
import  org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.Annotation.AutoWired;
import com.example.demo.service.Studentservice;
import org.springframework.factory.Annotation.PostMapping;


@RestController


public class Studentcontroller{
    @AutoWired Studentservice ser;
    @PostMapping("/post")
    public Studententity postval(@RequestBody StudentEntity entity){
        return service.postdata
    }
}