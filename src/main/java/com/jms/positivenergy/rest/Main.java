package com.jms.positivenergy.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    @GetMapping("/getPositiveEnergy")
    public String getPositiveEnergy(){
        return "here' you're full of positivy around you..";
    }
}
