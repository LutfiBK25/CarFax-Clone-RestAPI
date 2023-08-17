package com.lutfibk25.RestApiDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {

    //8080/drivers
    @GetMapping("/drivers")
    public String listDrivers() {
        return "List of Drivers";
    }

}
