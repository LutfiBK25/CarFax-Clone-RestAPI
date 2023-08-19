package com.lutfibk25.RestApiDemo.service;

import com.lutfibk25.RestApiDemo.model.Car;
import com.lutfibk25.RestApiDemo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service //identify as a service class
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository cRepository;

    @Override
    public List<Car> getCars() {
        return cRepository.findAll();
    }

    @Override
    public Car addCar(Car car) {
        return cRepository.save(car);
    }

    @Override
    public Car getCar(Long id) {
        Optional<Car> car = cRepository.findById(id);
        if (car.isPresent()){
            return car.get();
        } else {
            throw new RuntimeException("No Car with ID "+ id);
        }
    }

    @Override
    public String removeCar(Long id) {
        Optional<Car> car = cRepository.findById(id);
        if (car.isPresent()){
            cRepository.deleteById(id);
            return "Car got removed";
        } else {
            throw new RuntimeException("No Car with ID "+ id);
        }
    }

    @Override
    public String modifyCarInfo(Long id, Car car) {
        Optional<Car> carFinder = cRepository.findById(id);
        if (carFinder.isPresent()){
            cRepository.save(car);
            return "Car got updated";
        } else {
            throw new RuntimeException("No Car with ID "+ id);
        }
    }


}
