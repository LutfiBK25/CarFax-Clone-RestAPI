package com.lutfibk25.RestApiDemo.service;

import com.lutfibk25.RestApiDemo.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCars();

    Car addCar (Car car);

    Car getCar (Long id);

    String removeCar (Long id);

    String modifyCarInfo (Long id, Car car);
}
