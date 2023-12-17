package com.example.pair4.repositories;

import com.example.pair4.entities.Car;
import com.example.pair4.services.dtos.car.responses.GetAllCarResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    boolean existsCarByPlate(String plate);

}
