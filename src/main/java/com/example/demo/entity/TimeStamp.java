package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeStamp{
    @Id
    private Long id;
    Private String name;
    private String email;
    private LocalDate createdat;
    Private LocalDate updatedat;
@PrePersist
public void  oncreate(){
    LocalDateTime now=LocalDateTime.now();
    this.createdat=now;
    this.updatedat=now;
}
public void onupdate(){
    
}
}