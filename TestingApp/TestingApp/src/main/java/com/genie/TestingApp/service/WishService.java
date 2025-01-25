package com.genie.TestingApp.service;


import org.springframework.stereotype.Service;

@Service
public class WishService {

    public String getWish(String name){

        return name +" "+ "good morning";
    }
}
