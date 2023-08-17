package com.lutfibk25.RestApiDemo.controller;

import com.lutfibk25.RestApiDemo.model.Car;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShowRoomController {

    @Value("${app.name}") //if there was no value you should do this ${app.name: Driver Register}
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/version")
    public String getAppDetails (){
        return appName + ":" + appVersion;
    }

    //8080/cars
    @GetMapping("/cars")
    public String listDrivers() {
        return "List of Cars";
    }


    //this is something called a handler method where we can pass a value in the request
    //sending data from client to server
    @GetMapping("/cars/{id}") //when the Mapping and Path or Req Param are same variable putting the variable after annotation is not needed
    public String getCar (@PathVariable("id") Long id){
        return "this is employee # " + id;
    }

    @PostMapping("/cars")
    public String registerDriver (@RequestBody Car car){
        return "Registering Car in DB " + car;
    }


    @PutMapping("/cars/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody Car car){
        System.out.println("Updating the driver data for the id " + id);
        return car;
    }

    //this is using request params
    @DeleteMapping("/cars")
    public String removeCar (@RequestParam Long id) {

        return "Removing Car " + id;

    }



}
