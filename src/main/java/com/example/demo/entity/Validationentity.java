package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.

@Entity
public class Validationentity{
//id long//userName //email //password //age
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
@NotNull
@size(min=2,max=30,message="must be 2 to 10 character")
private String Username;
@Email(message="Email is not valid")
Private String  email;
@NotNull(message="password is mandatory")
private String password;
@positive()
private int age;

}