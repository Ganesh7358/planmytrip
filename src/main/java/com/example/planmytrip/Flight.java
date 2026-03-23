package com.example.planmytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Flight{
    @GetMapping("/Flight")
    public String getdata() {return "Please Book your flight tickets from book mytrip at 50% discont";}
}