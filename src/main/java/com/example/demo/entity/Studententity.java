package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
@Entity
public class Studententity{
    @Id
    @GeneratedValue(strategy=GeneratedType.IDENTITY)
private String Name;
private Integer id;
private String email;
private String password;
private Date createdate;
public Studententity(){}

public Integer getId(){
    return Id;
}
public String Name()
{
    return Name;
}
public String email(){
    return email;
}
public String password(){
    return password;
}
public Date createdate(){
    return createdate;
}

public void setName(String Name){
    this.Name=Name;
}
public void SetId(Integer Id){
    this.Id=Id;
}
public void s

}