package com.lutfibk25.RestApiDemo.repository;

import com.lutfibk25.RestApiDemo.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository <Car, Long> {

}
