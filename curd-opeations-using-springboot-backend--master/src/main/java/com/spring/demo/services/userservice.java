package com.spring.demo.services;

import com.spring.demo.Dtos.response;
import com.spring.demo.Dtos.userInfo;
import com.spring.demo.models.usermodel;
import com.spring.demo.repositories.userRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class userservice {

    @Autowired
    private userRespository userrepository;


    public response saveuser(userInfo userdetails){
        usermodel user = new usermodel(
                userdetails.getName(),
                userdetails.getEmail(),
                userdetails.getMobile());

        userrepository.save(user);

        response status = new response("success","user details saved successfully");
        return status;
    }
    public usermodel findbyname(int id){
            usermodel  details =  userrepository.findById(id);
            return details;
    }
    public List<usermodel> alldata(){
       List <usermodel> details = userrepository.findAll();
        return details;
    }
    public void delete(int id){
        userrepository.deleteById(id);
    }
    public response edit(usermodel details){
        usermodel user = userrepository.findById(details.getId());
        if(user != null){
            user.setName(details.getName());
            user.setEmail(details.getEmail());
            user.setMobile(details.getMobile());
            userrepository.save(user);
            response res = new response("success","successfully edited");
            return res;
        }
        else{
            response res = new response("Error","user not found");
            return res;
        }

    }
}
