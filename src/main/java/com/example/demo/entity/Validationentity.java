package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints;

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
@positive(message="Age must be positive")
@Max(30)
private int age;

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
public Valdationentity(long id,@NotNull@Size(min=2,max=10,message="must be 2 to 10 character"),String username,@Email(message="Email is not valid")String email,
@Size(min=2,max=10,message="must be 2 to 10  character")@NotNull(message="password is mandatory")
private String password,@positive(message="Age must be positive")
@Max(30)
private int age)
@override


}
