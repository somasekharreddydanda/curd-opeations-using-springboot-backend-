package com.spring.demo.models;

import javax.persistence.*;

@Entity
@Table(name="userdetails")
public class usermodel {
    private String name;
    private String email;
    private int mobile;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
public usermodel(){

}
    public usermodel(String name, String email, int mobile) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;

    }
}
