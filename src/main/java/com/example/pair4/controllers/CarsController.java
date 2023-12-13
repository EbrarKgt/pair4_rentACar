package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.CarService;
import com.example.pair4.services.dtos.car.requests.AddCarRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/cars")
@AllArgsConstructor
public class CarsController {


    private final CarService carService;

    @PostMapping
    private void add(@RequestBody AddCarRequest addCarRequest){

        carService.add(addCarRequest);

    }


}
