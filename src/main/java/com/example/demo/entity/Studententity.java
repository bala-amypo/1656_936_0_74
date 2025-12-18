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
public String getName()
{
    return Name;
}
public String getEmail(){
    return email;
}
public String getPassword(){
    return password;
}
public Date getCreatedate(){
    return createdate;
}

public void setName(String Name){
    this.Name=Name;
}
public void setId(Integer Id){
    this.Id=Id;
}
public void setEmail(String email){
    this.email=email;
}
public void setCreatedate(Date Createdate){
    this.createdate=createdate;
}
public void setPassword(String Password){
    this.Password=password;
}

}