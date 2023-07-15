package com.spring.demo.controller;

import com.spring.demo.Dtos.response;
import com.spring.demo.Dtos.userInfo;
import com.spring.demo.models.usermodel;
import com.spring.demo.services.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/user")
@RestController
public class usercontroller {
    @Autowired
    private userservice userservices;

    @PostMapping("/save")
    public response saveuser(@RequestBody userInfo userdetails){return  userservices.saveuser(userdetails);
    }

    @PostMapping("/{id}")
    public usermodel getDetails(@PathVariable("id") int id){
        return userservices.findbyname(id);
    }
    @PostMapping("/all")
    public List<usermodel> getall(){
        return userservices.alldata();
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id){
         userservices.delete(id);
    }

    @PostMapping("/edit")
    public response edit(@RequestBody usermodel user){
        return userservices.edit(user);
    }


}
