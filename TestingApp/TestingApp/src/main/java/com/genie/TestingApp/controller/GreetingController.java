package com.genie.TestingApp.controller;

import com.genie.TestingApp.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    WishService wishService;

    @GetMapping("/wish")
    public String getWish(){
        return wishService.getWish("Ayush");
    }
}
