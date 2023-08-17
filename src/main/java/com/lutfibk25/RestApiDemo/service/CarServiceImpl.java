package com.lutfibk25.RestApiDemo.service;

import com.lutfibk25.RestApiDemo.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //identify as a service class
public class CarServiceImpl implements CarService{

    private static List<Car> Cars= new ArrayList<>();
    static {
        Car car1 = new Car();
        car1.setMaker("Honda");
        car1.setBodyStyle("SUV");
        car1.setEngine("V6");
        car1.setLocation("NJ");
        Cars.add(car1);

        car1 = new Car();
        car1.setMaker("Ferrari");
        car1.setBodyStyle("Coupe");
        car1.setEngine("V8");
        car1.setLocation("NY");
        car1.setModel("SF90");
        Cars.add(car1);

    }
    @Override
    public List<Car> getCars() {
        return Cars;
    }
}
