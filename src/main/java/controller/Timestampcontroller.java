package com.example
import com.example.demo.entity.Timestamp;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class Timestampcontroller{
    @Autowired Timestampservice service;
    @postMapping("/timepost")
    public Times5tamp posttimed(@RequestBody Timestamp entity){
        return service.posttimed(entity);
    }
}