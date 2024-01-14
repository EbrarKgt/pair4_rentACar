package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.CarService;
import com.example.pair4.services.dtos.car.requests.AddCarRequest;
import com.example.pair4.services.dtos.car.requests.DeleteCarRequest;
import com.example.pair4.services.dtos.car.requests.UpdateCarRequest;
import com.example.pair4.services.dtos.car.responses.GetAllCarResponse;
import com.example.pair4.services.dtos.car.responses.GetCarByIdResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/cars")
@AllArgsConstructor
@CrossOrigin
public class CarsController {

    private final CarService carService;

    @PostMapping("add")
    private void add(@RequestBody @Valid AddCarRequest addCarRequest) {
        carService.add(addCarRequest);
    }

    @DeleteMapping
    private void delete(@RequestBody @Valid DeleteCarRequest deleteCarRequest) {
        carService.delete(deleteCarRequest);
    }

    @PutMapping
    private void update(@RequestBody @Valid UpdateCarRequest updateCarRequest) {
        carService.update(updateCarRequest);
    }

    @GetMapping("get-all-cars")
    private List<GetAllCarResponse> getAll() {
        return carService.getAll();
    }

    @GetMapping("/get/{id}")
    private GetCarByIdResponse getByIdResponse(@PathVariable int id) {
        return carService.getCarByIdResponse(id);
    }
}
