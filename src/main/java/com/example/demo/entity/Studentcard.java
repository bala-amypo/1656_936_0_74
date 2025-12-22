package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
@AllArgsconstructor
@NoArgsconstructor
public class studentcard{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String CollegeName;
    private String Department;

    @OneToOne
    @JoinColumn(name="student_id")
    private studentdetails student;
}