package com.genie.TestingApp;


import com.genie.TestingApp.service.WishService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WishServiceTest {

    private final WishService wishService=new WishService();

    @Test
    void GetTestWish(){
        String name="Ayush";
        String expectedResponse="Ayushgood morning";
        String result=wishService.getWish(name);
        assertEquals(expectedResponse,result,"The greeting message should match the expected response");

    }
}
