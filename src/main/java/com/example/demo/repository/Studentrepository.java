package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.Jpa.Repository.JpaRepository;
import com.example.demo.entity.Studententity;

@Repository
public interface Studentrepository extends JpaRepository<Studententity,Integer>{

}

