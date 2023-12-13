package com.example.pair4.services.concretes;

import com.example.pair4.entities.Car;
import com.example.pair4.entities.Color;
import com.example.pair4.entities.Model;
import com.example.pair4.repositories.CarRepository;
import com.example.pair4.services.abstracts.CarService;
import com.example.pair4.services.abstracts.ColorService;
import com.example.pair4.services.abstracts.ModelService;
import com.example.pair4.services.dtos.car.requests.AddCarRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private final CarRepository carRepository;
    private final ModelService modelService;
    private final ColorService colorService;

    @Override
    public void add(AddCarRequest addCarRequest) {

        Car car = new Car();

        car.setKilometer(addCarRequest.getKilometer());

        car.setPlate(addCarRequest.getPlate());

        car.setYear(addCarRequest.getYear());

        car.setDailyPrice(addCarRequest.getDailyPrice());

        Model model = modelService.getById(addCarRequest.getModelId());
        car.setModel(model);

        Color color = colorService.getById(addCarRequest.getColorId());
        car.setColor(color);

        carRepository.save(car);


    }
}

// @NoArgsConstructor :)
