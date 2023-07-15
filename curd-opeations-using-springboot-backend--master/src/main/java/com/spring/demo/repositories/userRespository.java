package com.spring.demo.repositories;

import com.spring.demo.models.usermodel;
import com.spring.demo.userResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userRespository extends JpaRepository<usermodel,Integer>{
//    @Query("SELECT new com.spring.demo.userResponse(e.id,e.name,e.email,e.mobile) FROM usermodel e WHERE name = ?1")
    usermodel findById(@Param("name") int id);
    List<usermodel> findAll();
}
