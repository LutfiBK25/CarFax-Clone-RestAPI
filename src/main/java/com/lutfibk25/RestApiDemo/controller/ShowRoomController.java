package com.lutfibk25.RestApiDemo.controller;

import com.lutfibk25.RestApiDemo.model.Car;
import com.lutfibk25.RestApiDemo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
// @RequestMapping("/api/v1") I can add it somewhere better LOL instead of on each controller (hint: Application properties)
public class ShowRoomController {


    @Autowired
    private CarService carService;

    @Value("${app.name}") //if there was no value you should do this ${app.name: Driver Register}
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/version")
    public String getAppDetails() {
        return appName + ":" + appVersion;
    }

    //8080/cars
    @GetMapping("/cars")
    public List<Car> listCars() {
        return carService.getCars();
    }


    //this is something called a handler method where we can pass a value in the request
    //sending data from client to server
    @GetMapping("/cars/{id}")
    //when the Mapping and Path or Req Param are same variable putting the variable after annotation is not needed
    public Car getCar(@PathVariable("id") Long id) {
        return carService.getCar(id);
    }

    @PostMapping("/cars")
    public Car registerCar(@RequestBody Car car) {
        return carService.addCar(car);
    }


    @PutMapping("/cars/{id}")
    public String updateCar(@PathVariable Long id, @RequestBody Car car) {
        return carService.modifyCarInfo(id, car);
    }

    //this is  using request params
    @DeleteMapping("/cars")
    public String removeCar(@RequestParam Long id) {

        return carService.removeCar(id);

    }



}
