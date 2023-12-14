package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.CarService;
import com.example.pair4.services.dtos.car.requests.AddCarRequest;
import com.example.pair4.services.dtos.car.requests.DeleteCarRequest;
import com.example.pair4.services.dtos.car.requests.UpdateCarRequest;
import com.example.pair4.services.dtos.car.responses.GetAllCarResponse;
import com.example.pair4.services.dtos.car.responses.GetByIdResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/cars")
@AllArgsConstructor
public class CarsController {


    private final CarService carService;

    @PostMapping
    private void add(@RequestBody AddCarRequest addCarRequest){

        carService.add(addCarRequest);

    }

    @DeleteMapping
    private void delete(@RequestBody DeleteCarRequest deleteCarRequest){
        carService.delete(deleteCarRequest);
    }

    @PutMapping
    private void update(@RequestBody UpdateCarRequest updateCarRequest){
        carService.update(updateCarRequest);
    }

    @GetMapping
    private List<GetAllCarResponse> getAll(){
        return carService.getAll();
    }

    @GetMapping("{id}")
    private GetByIdResponse getById(@PathVariable int id){
        return carService.getById(id);
    }
}
