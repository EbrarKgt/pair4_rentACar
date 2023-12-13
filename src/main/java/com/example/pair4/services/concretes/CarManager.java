package com.example.pair4.services.concretes;

import com.example.pair4.repositories.CarRepository;
import com.example.pair4.services.abstracts.CarService;
import com.example.pair4.services.dtos.car.requests.AddCarRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarManager implements CarService {
    private final CarRepository carRepository;


    @Override
    public void add(AddCarRequest addCarRequest) {


    }
}

// @NoArgsConstructor :)
