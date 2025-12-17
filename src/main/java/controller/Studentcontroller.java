package com.example.demo.controller;
import  org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.Annotation.AutoWired;
import com.example.demo.service.Studentservice;
import org.springframework.

@RestController


public class Studentcontroller{
    @AutoWired Studentservice ser;
}